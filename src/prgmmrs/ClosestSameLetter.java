package prgmmrs;

import java.util.Arrays;
import java.util.HashMap;

public class ClosestSameLetter {
    public static void main(String[] args) {

        String s = "andweneedeachotherandwebelievewewantoneanotherandiknowwillgonnauncoverwhatssleepinoursoul";
        int [] answer = new int[s.length()];
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i<s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), i);
                answer[i] = -1;
            } else {
                answer[i] = i-hashMap.get(s.charAt(i));
                hashMap.put(s.charAt(i), i);
            }
        }

        System.out.println(Arrays.toString(answer));

    }
}
