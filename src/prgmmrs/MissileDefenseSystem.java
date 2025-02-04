package prgmmrs;

import java.util.Arrays;
import java.util.Comparator;

public class MissileDefenseSystem {
    public static void main(String[] args) {
        int[][] targets = {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};

        Arrays.sort(targets, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int answer = 0;
        for(int i = 0; i< targets.length; i++) {
            if (targets[i][0] == -1) {
                continue;
            } else {
                answer++;
                int a = targets[i][1];
                for(int j = i+1; j< targets.length; j++) {
                    if (targets[j][0]<a) {
                        targets[j][0] = -1;
                    }
                }
            }
        }
    }
}
