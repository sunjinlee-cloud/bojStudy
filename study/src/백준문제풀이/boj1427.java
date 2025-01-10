package 백준문제풀이;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class boj1427 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] arr = new int[11];
        int a = 1;
        int cnt = 0;
        do {
            arr[a] = N%10;
            N = N/10;
            a ++;
            cnt ++;
        } while (N>0);

        Arrays.sort(arr);
        for (int i=10; i>10-cnt; i--) {
            System.out.print(arr[i]);
        }
    }
}
