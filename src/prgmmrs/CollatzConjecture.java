package prgmmrs;

import LinkedListQueue.Queue;

import java.util.ArrayList;
import java.util.Arrays;

public class CollatzConjecture {
    public static void main(String[] args) {

        int n = 10;
        int origin = n;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(origin);

        while(n!=1) {
            if (n%2==0) {
                n /= 2;
                arrayList.add(n);
            } else {
                n = 3*n+1;
                arrayList.add(n);
            }
        }

        int [] answer = new int[arrayList.size()];
        answer[0] = origin;
        for (int i = 0; i< answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
