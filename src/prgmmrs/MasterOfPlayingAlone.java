package prgmmrs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MasterOfPlayingAlone {
    public static void main(String[] args) {
        int[] cards = {9, 5, 2, 8, 6, 3, 10, 4, 7, 1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        int hop = 0;
        int startNum = -1;
        int currentNum = -1;
        int tempNum = -1;
        int[] cardsCopy = new int[cards.length];
        for(int i = 0; i< cards.length; i++) {
            if(cardsCopy[i] == 1) {
                continue;
            }
            startNum = i+1;
            tempNum = i;
            while(startNum != currentNum) {
                cardsCopy[tempNum] = 1;
                currentNum = cards[tempNum];
                tempNum = currentNum-1;
                hop++;
            }
            arrayList.add(hop);
            hop = 0;
        }
        int answer = 0;
        if(arrayList.size()>1) {
            arrayList.sort(Comparator.naturalOrder());
            answer = arrayList.get(arrayList.size()-1)* arrayList.get(arrayList.size()-2);
        }
        System.out.println("답: "+answer);
    }
}
