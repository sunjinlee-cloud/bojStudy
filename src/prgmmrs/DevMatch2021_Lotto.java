package prgmmrs;

import java.util.Arrays;

public class DevMatch2021_Lotto {
    public static void main(String[] args) {
        int[] lottos = {1, 2, 3, 4, 5, 6};
        int[] win_nums = {7, 8, 9, 10, 11, 12};

        int zeroNum = 0;
        int isHere = 0;
        for(int i = 0; i< lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroNum++;
                isHere++;
            } else {
                for(int j = 0; j< win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        isHere++;
                    }
                }
            }
        }

        int a = 7-isHere;
        int b = 7-(isHere-zeroNum);
        if (a == 7) a = 6;
        if (b == 7) b = 6;
        int []answer = {a, b};
        System.out.println(Arrays.toString(answer));
    }
}
