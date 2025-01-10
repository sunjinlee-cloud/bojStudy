import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class boj15650 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        check = new boolean[N+1];
        arr = new int[M];

        backTrack(start, N, M, 0);

        bw.flush();
        bw.close();
    }

    static boolean [] check;
    static int [] arr;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int start = 0;
    static void backTrack(int start, int N, int M, int num) throws IOException {
        if(num == M) {
            for (int val : arr) {
                bw.write(val+" ");
            }
            bw.newLine();
        }
        for (int i = start; i<N; i++) {
            if (start >= N || num>=M) {
                return;
            }
            else if (!check[i]) {
                arr[num] = i+1;
                check[i] = true;
                start++;
                backTrack(start, N, M, num+1);
                check[i] = false;
            }

        }
    }
}
