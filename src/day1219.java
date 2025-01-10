import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class day1219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cycle = 0;
        int origin = N;

        do {
            int M = N/10 + N%10;
            N = (N%10)*10 + M%10;
            cycle ++;
        } while (N != origin);

        System.out.println(cycle);
    }
}
