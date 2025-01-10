import java.io.*;

public class boj1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [][] mem = new int[41][2];
        mem[0][0] = 1;
        mem[0][1] = 0;
        mem[1][0] = 0;
        mem[1][1] = 1;

        int T = Integer.parseInt(br.readLine());
        int max = 0;
        int startPoint = 0;
        for (int i = 0; i<T; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a>max) {
                max = a;
                for(int k = startPoint; k<max-1; k++) {
                    for(int j = 0; j<2; j++) {
                        mem[k+2][j] = mem[k+1][j] + mem[k][j];
                    }
                }
                startPoint = max-1;
            }
            bw.write(String.valueOf(mem[a][0]+" "+mem[a][1]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
