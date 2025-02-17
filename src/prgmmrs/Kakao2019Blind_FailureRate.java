package prgmmrs;

import java.util.Arrays;
import java.util.HashMap;

public class Kakao2019Blind_FailureRate {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        Arrays.sort(stages); //{1, 2, 2, 2, 3, 3, 4, 6}

        HashMap<Integer, Double> map = new HashMap<>();
        int leftNum = stages.length;
        int num = stages[0];

        int cnt = 0;
        for(int i = 0; i<stages.length; i++) {
            if(i == 0) {
                cnt++;
            } else {
            if (stages[i] == num) {
                cnt++;
            } else {
                map.put(stages[i-1], (double) (cnt/leftNum)); //3, 2/4
                num = stages[i]; //4
                leftNum -= cnt; //2
                cnt = 1;
                }
            }
        }


    }
}

//해쉬맵을 만들게 되면 실패율 정렬이 힘듦 - 해쉬맵 만들고 나서 내용물 배열에 넣어서 정렬?