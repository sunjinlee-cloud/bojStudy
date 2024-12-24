package 백준문제풀이;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class boj1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i = 1; i<2666800; i++) {
            if (String.valueOf(i).contains(String.valueOf(666))) {
                count ++;
            }
            if (count == N) {
                System.out.println(i);
                break;
            }
        }
    }
}
