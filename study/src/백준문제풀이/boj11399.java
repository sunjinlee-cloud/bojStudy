package 백준문제풀이;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        long partialSum = 0;
        long sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i<N; i++) {
            partialSum += arr[i];
            sum += partialSum;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
