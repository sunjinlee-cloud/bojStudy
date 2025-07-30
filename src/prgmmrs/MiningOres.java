package prgmmrs;

import java.util.Arrays;
import java.util.Collections;

public class MiningOres {
    public static void main(String[] args) {
        int[] picks = {1,0,1};
        String[] minerals = {"iron", "iron", "iron", "iron", "diamond", "diamond", "diamond"};
        int picksSum = Arrays.stream(picks).sum();
        int len = minerals.length/5;
        if(minerals.length % 5 != 0) {
            len+=1;
        }
        int [] mineralsInt = new int[Math.min(len, picksSum)];
        for(int i = 0; i<Math.min(minerals.length, picksSum*5); i++) {
            if(minerals[i].equals("diamond")) {
                mineralsInt[i/5] += 100;
            }else if (minerals[i].equals("iron")) {
                mineralsInt[i/5] += 10;
            }else {
                mineralsInt[i/5] += 1;
            }
        }
        Integer[] mineralsInt2 = Arrays.stream(mineralsInt).boxed().toArray(Integer[]::new);
        Arrays.sort(mineralsInt2, Collections.reverseOrder());

        System.out.println("값으로 바꾼 광물 "+Arrays.toString(mineralsInt2));
        //answer가 피로도
        int answer = 0;
        for(int i = 0; i<mineralsInt.length; i++) {
            if(mineralsInt2[i] == 0) {
                continue;
            }
            if(picks[0] != 0) {
                answer += (mineralsInt2[i]/100);
                mineralsInt2[i] %= 100;
                answer += mineralsInt2[i]/10;
                answer += mineralsInt2[i]%10;
                picks[0]--;
            } else if (picks[1] != 0) {
                answer += 5*(mineralsInt2[i]/100);
                mineralsInt2[i] %= 100;
                answer += mineralsInt2[i]/10;
                answer += (mineralsInt2[i]%10);
                picks[1]--;
            } else if (picks[2] != 0) {
                answer += 25*(mineralsInt2[i]/100);
                mineralsInt2[i] %= 100;
                answer += 5*(mineralsInt2[i]/10);
                answer += mineralsInt2[i]%10;
                picks[2]--;
            } else break;
            System.out.println("i값: "+i+" 피로도 : "+answer+" 광물값 배열 : "+Arrays.toString(mineralsInt2));
        }
        System.out.println(answer);
    }
}
