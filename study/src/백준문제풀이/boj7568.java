

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int[N][2];

        for (int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int num = 1;
        for (int i = 0; i<N; i++) {
            num = 1;
            for (int j = 0; j<N; j++) {
                if (arr[i][0]<arr[j][0] && arr[j][1] > arr[i][1]) {
                    num ++;
                }
            }
            bw.write(String.valueOf(num)+" ");
        }
        bw.flush();
        bw.close();
    }
}
