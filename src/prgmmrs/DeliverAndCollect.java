package prgmmrs;

import java.util.Arrays;

public class DeliverAndCollect {
    public static void main(String[] args) {
        int cap = 4;
        int n = 5;
        int[] deliveries = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};
        int[] arr = new int[deliveries.length];
        for(int i = 0; i< deliveries.length; i++) {
            arr[i] = deliveries[i]+pickups[i]*100;
        }
        System.out.println(Arrays.toString(arr));
        int ptr = -1;
        for(int i = deliveries.length-1; i>=0; i--) {
            if(deliveries[i] != 0) {
                ptr = i;
                break;}
        }
        long answer = ptr;
        int temp = cap;
        while(true) {

            ptr--;
            if(temp == 0) {
                answer += ptr;
                temp = cap;
            }
            if(ptr == 0 & arr[ptr] == 0) break;
        }


        System.out.println(answer);
    }
}
