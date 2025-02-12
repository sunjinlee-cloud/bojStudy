package prgmmrs;

import java.util.*;

public class PickTwoAndSum {
    public static void main(String[] args) {
        int[] numbers = {0,100,1000,10};

        Arrays.sort(numbers);
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i<numbers.length; i++) {
            for(int j = i+1; j<numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }

        Iterator<Integer> iter = set.iterator();
        int[] answer = new int[set.size()];
        for(int i = 0; i< answer.length; i++) {
            answer[i] = iter.next();
        }
        System.out.println(Arrays.toString(answer));
    }
}
