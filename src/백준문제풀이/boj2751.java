package 백준문제풀이;

import java.io.*;
import java.util.Arrays;

public class boj2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        for (int i = 0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i<N; i++) {
            bw.write(String.valueOf(arr[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
