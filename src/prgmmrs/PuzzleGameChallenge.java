package prgmmrs;

import java.util.TreeSet;

public class PuzzleGameChallenge {
    public static void main(String[] args) {

        int[] diffs = {1, 5, 3};
        int[] times = {2, 4, 7};
        long limit = 30;

        int start = 0;
        int end = 100000;

        System.out.println(method(start, end, diffs, times,limit));


    }

    public static int method(int start, int end, int [] diffs, int [] times, long limit) {
        long time = 0;
        int focus = (start + end)/2;
        for(int i = 0; i<diffs.length;i++) {
            if (focus >= diffs[i]) {
                time += times[i];
            } else {
                if (i == 0) {
                    time += (long) (diffs[i] - focus) * (times[i]) + times[i];
                } else {
                    time += (long) (diffs[i] - focus) * (times[i] + times[i - 1]) + times[i];
                }
            }
        }
        while (start <= end) {
            if (time > limit) {
                start = focus+1;
                return method(start, end, diffs, times, limit);
            } else if (time < limit) {
                end = focus-1;
                return method(start, end, diffs, times, limit);
            } else {
                return focus;
            }
        }

        int a = focus+1;
        time = 0;
        for(int i = 0; i<diffs.length;i++) {
            if (a >= diffs[i]) {
                time += times[i];
            } else {
                if (i == 0) {
                    time += (long) (diffs[i] - a) * (times[i]) + times[i];
                } else {
                    time += (long) (diffs[i] - a) * (times[i] + times[i - 1]) + times[i];
                }
            }
        }
        if (time<=limit) {
            focus = a;
        }

        return focus;
    }

}
//while(true){
//  time =0;
//  proficiency++;
//        for(int i = 0; i<diffs.length;i++){
//          if(proficiency >=diffs[i]){
//              time +=times[i];
//          }else{
//              if(i ==0){
//                  time +=(long)(diffs[i]-proficiency)*(times[i])+times[i];
//              }else{
//                  time +=(long)(diffs[i]-proficiency)*(times[i]+times[i -1])+times[i];
//              }
//          }
//          if(time >limit){
//              break;
//              }
//        }
//        if(time <=limit){
//          break;
//        }
//   }