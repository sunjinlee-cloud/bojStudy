import java.util.Scanner;

public class boj11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long [] arr = new long[1001];
        arr[1] = 1L;
        arr[2] = 2L;

        for (int i = 1; i<n-1; i++) {
            arr[i+2] = (arr[i+1] + arr[i])%10007;
        }
        System.out.println(arr[n]);
    }
}
