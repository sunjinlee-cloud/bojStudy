package prgmmrs;

import java.util.Arrays;
import java.util.*;

public class AddingNonExistingNums {
    public static void main(String[] args) {
        int [] numbers = {5,8,4,0,6,7,9};

        int answer = 45;
        for(int i : numbers) {
            answer -= i;
        }

        System.out.println(answer);
    }
}
