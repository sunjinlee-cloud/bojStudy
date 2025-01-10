import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int [] arr = new int[N+1];
        arr[1] = 1;

        for (int i = 2; i<=Math.sqrt(N); i++) {
            for (int j = 2; i*j<=N; j++) {
                arr[i*j] = 1;
            }
        }

        for (int i = M; i<=N; i++) {
            if (arr[i] == 0) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
