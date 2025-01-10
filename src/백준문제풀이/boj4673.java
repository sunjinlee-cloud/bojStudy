package 백준문제풀이;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class boj4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[11116];

        for (int i = 1; i < 10001; i++) {
            arr[i] = 0;
        }

        for (int i = 1; i < 10001; i++) {
            int a = i;
            int sum = a;
            do {sum += a%10;
                a /=10;} while (a>0);
            arr[sum] = 1;
        }

        for (int i = 1; i < 10001; i++) {
            if (arr[i] == 0) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
