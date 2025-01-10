import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] arr = new int[N+1];
        int [] prefixSum = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i<=N; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        int prefixIndex = 0;
        for (int k = 0; k<M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            if (prefixIndex < j) {
                for (int l = prefixIndex; l<j+1; l++) {
                    if (l == 0) {
                        prefixSum[l] = arr[l];
                    }else {
                        prefixSum[l] = arr[l] + prefixSum[l-1];
                    }
                    prefixIndex = j;
                }
            }

            bw.write(String.valueOf(prefixSum[j]-prefixSum[i-1]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
