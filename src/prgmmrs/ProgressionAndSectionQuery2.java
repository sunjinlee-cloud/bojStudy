package prgmmrs;

import java.util.Arrays;

public class ProgressionAndSectionQuery2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[][] queries = {{2, 4, 5}, {0, 3, 1}, {2, 3, 2}};

        int [] answer = new int[queries.length];
        for (int i = 0; i< answer.length; i++) {
            answer[i] = -1;
        }

        for (int i = 0; i< queries.length; i++) {
            int [] temp = Arrays.copyOfRange(arr, queries[i][0], queries[i][1]+1);
            Arrays.sort(temp);
            for (int j = 0; j< temp.length; j++) {
                if (temp[j]>queries[i][2]) {
                    answer[i] = temp[j];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
