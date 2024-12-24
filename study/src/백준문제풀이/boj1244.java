package 백준문제풀이;

import java.util.Scanner;

public class boj1244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfSwitch = sc.nextInt();
        int [] arr = new int[numOfSwitch+1];

        for (int i = 1; i<=numOfSwitch; i++) {
            arr[i] = sc.nextInt();
        }

        int testCase = sc.nextInt();

        for (int i = 0; i<testCase; i++) {
            int gender = sc.nextInt();
            int switchNo = sc.nextInt();

            if (gender == 1) {
                for (int j = 1; j<=numOfSwitch; j++) {
                    if (j%switchNo == 0) {arr[j] = turnSwitch(arr[j]);}
                }
            }
            else {
                arr[switchNo] = turnSwitch(arr[switchNo]);
                for (int k = 1; (switchNo-k>=1 && switchNo+k<=numOfSwitch); k++) {
                    if (arr[switchNo-k] == arr[switchNo+k]) {
                        arr[switchNo-k] = turnSwitch(arr[switchNo-k]);
                        arr[switchNo+k] = turnSwitch(arr[switchNo+k]);
                    }
                    else break;
                }
            }
        }
        for (int i = 1; i<=numOfSwitch; i++) {
//            if (i == numOfSwitch) {
//                System.out.print(arr[i]);
//            }
            System.out.print(arr[i]+" ");
            if (i%20 == 0)
                System.out.println();
        }


    }

    public static int turnSwitch (int a) {
        if (a == 0) {return 1;}
        else {return 0;}
    }
}
