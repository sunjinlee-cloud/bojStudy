import java.util.Scanner;

public class boj11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        arr[1] = 1;
        if (n >1) {
            arr[2] = 3;
        }

        for (int i = 1; i<n-1; i++) {
            arr[i+2] = (arr[i+1] + 2*arr[i])%10007;
        }

        System.out.println(arr[n]);
    }
}
