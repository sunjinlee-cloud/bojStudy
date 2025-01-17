package prgmmrs;

import java.util.Arrays;
import java.util.Comparator;

public class PCCE_DataAnalyze {
    public static void main(String[] args) {
        int [][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        String [] index = {"code" ,"date","maximum","remain"};
        int [][] selected = new int[data.length][data[0].length];
        int extIndex = -1;
        for (int i = 0; i<index.length; i++) {
            if (index[i].equals(ext)) extIndex = i;
        }
        int sortIndex = -1;
        for (int i = 0; i<index.length; i++) {
            if (index[i].equals(sort_by)) sortIndex = i;
        }

        int a = 0;
        for (int i = 0; i<data.length; i++) {
            if (data[i][extIndex] < val_ext) {
                selected[a] = data[i];
                a++;
            }
        }

        int [][] temp = new int[a][data[0].length];
        for (int i = 0; i<a; i++) {
            temp[i] = selected[i];
        }

        selected = temp;
        temp = null;

        int finalSortIndex = sortIndex;
        Arrays.sort(selected, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return  o1[finalSortIndex]-o2[finalSortIndex];
            }
        });

        System.out.println(Arrays.deepToString(selected));
    }
}
