package 백준문제풀이;

import java.util.Scanner;

public class boj1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int cnt = 0;

        if (N<100) cnt = N;

        else {
            cnt = 99;
            for (int i = 100; i<=N; i++) {
                int a = i/100 ;
                int b = (i - ((i/100)*100))/10;
                int c = i%10;
                if ((a - b) == (b - c)) { cnt ++;}
            }
        }
        System.out.println(cnt);
    }
}
