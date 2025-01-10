import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class boj9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[11];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        int a = 1;
        for (int i = 0; i<n; i++) {
            int testCase = Integer.parseInt(br.readLine());
            for (int j = a; j<testCase-2; j++) {
                if (arr[j+3] == 0) {
                    arr[j+3] = arr[j] + arr[j+1] + arr[j+2];
                }
            }
            a = testCase-2;
            bw.write(String.valueOf(arr[testCase]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
