package prgmmrs;

import java.util.Arrays;
import java.util.Comparator;

public class FruitSeller {
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        Integer [] score2 = new Integer[score.length];
        for (int i = 0; i< score.length; i++) {
            score2[i] = score[i];
        }

        Arrays.sort(score2, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int answer = 0;
        for (int i = 0; i< score2.length; i+=m) {
            if (score2.length-i<m) {
                break;
            } else {
                answer += score2[i+m-1]*m;
            }
        }
        System.out.println(answer);
    }
}
