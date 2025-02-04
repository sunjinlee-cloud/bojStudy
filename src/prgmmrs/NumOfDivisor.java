package prgmmrs;

import java.util.TreeSet;

public class NumOfDivisor {
    public static void main(String[] args) {
        int left = 24;
        int right = 27;

        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i = 0; i<32; i++) {
             treeSet.add((i+1)*(i+1));
        }

        int answer = 0;
        for(int i = left; i<right+1; i++) {
            if (treeSet.contains(i)){
                answer -= i;
            } else {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
