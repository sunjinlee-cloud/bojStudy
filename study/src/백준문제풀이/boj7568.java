package 백준문제풀이;

import java.io.*;
import java.util.StringTokenizer;

public class boj7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int [][] arr = new int[51][3];

        int N = Integer.parseInt(br.readLine());
        int a = 1;
        int wMax = 0;
        int hMax = 0;
        for (int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[a][2] = 1;
            a ++;
            if (wMax<x) {wMax = x;}
        }



    }
}
