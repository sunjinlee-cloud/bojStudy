package 백준문제풀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;

        int [] arr = new int[N];
        for (int i = 0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N-1; i>=0; i--) {
            if(K/arr[i] > 0) {
                count += K/arr[i];
                K = K - (K/arr[i])*arr[i];
            }
        }
        System.out.println(count);
    }
}
