package prgmmrs;

import java.util.Arrays;

public class CarvingSequences {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] query = {4, 1, 2};

        for (int i = 0; i< query.length; i++) {
            if (i%2 == 0) {
                arr = Arrays.copyOfRange(arr,0,query[i]+1);
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        int [] answer = arr;
    }
}
