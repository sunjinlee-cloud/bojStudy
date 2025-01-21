package prgmmrs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HallOfFame {
    public static void main(String[] args) {
        int k = 8;
        int[] score = {0, 1,2,3,4};

        int [] answer = new int[score.length];
        int [] hof = new int[k];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<k; i++) {
            hof[i] = 2001;
        }
        for (int i = 0; i<k; i++) {
            if (i>score.length-1) break;
            hof[i] = score[i];
            Arrays.sort(hof);
            list.add(hof[0]);
        }

        for (int i = k; i< score.length; i++) {
            if (hof[0] > score[i]) {
                list.add(hof[0]);
            } else {
                hof[0] = score[i];
                Arrays.sort(hof);
                list.add(hof[0]);
            }
        }

        for (int i = 0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        System.out.println(Arrays.toString(answer));
    }
}
