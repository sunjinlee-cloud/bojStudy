package prgmmrs;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionTableHash {
    public static void main(String[] args) {
        int[][] data ={{2,2,6},{1,5,10},{4,2,9},{3,8,3}};
        int col = 2;
        int row_begin = 2;
        int row_end= 3;

        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[col-1] == o2[col-1]) {
                    return o2[0] - o1[0];
                } else return o1[col-1] - o2[col-1];
            }
        });

        int sum = 0;
        int answer = 0;
        for (int i = row_begin-1; i<row_end; i++) {
            for(int j = 0; j<data[0].length; j++) {
                sum += data[i][j]%(i+1);
            }
            answer = answer ^ sum;
            sum = 0;
        }

        System.out.println(Arrays.deepToString(data));
        System.out.println(answer);
    }
}
