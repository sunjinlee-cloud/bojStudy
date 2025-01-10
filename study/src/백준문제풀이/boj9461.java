import java.io.*;

public class boj9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        long [] arr = new long[101];
        int index = 6;
        arr[1] = 1L;
        arr[2] = 1L;
        arr[3] = 1L;
        arr[4] = 2L;
        arr[5] = 2L;
        arr[6] = 3L;

        for (int i = 0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            if (N>index) {
                for (int j = index; j<N+1; j++) {
                    arr[j] = arr[j - 1] + arr[j - 5];
                }
                index = N;
            }
            bw.write(String.valueOf(arr[N]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
