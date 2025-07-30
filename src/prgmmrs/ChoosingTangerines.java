package prgmmrs;

import java.util.*;

public class ChoosingTangerines {
    public static void main(String[] args) {
        int k = 2;
        int[] tangerine ={1, 1, 1, 1, 2, 2, 2, 3};

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< tangerine.length; i++) {
            int temp = map.getOrDefault(tangerine[i], 0);
            map.put(tangerine[i], temp + 1);
        }
        Collection<Integer> c = map.values();
        Integer[] arr = c.toArray(new Integer[0]);
        Arrays.sort(arr, Collections.reverseOrder());

        int answer = 0;
        for(int i = 0; i<arr.length; i++) {
            k-=arr[i];
            answer++;
            if(k<=0) break;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(answer);
    }
}
