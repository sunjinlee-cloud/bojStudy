package prgmmrs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/*
   !!!!!!!!!!!!!!!! 아직 다 못했음 !!!!!!!!!!!!!!!!!!
 */


public class RentingHotelRooms {
    public static void main(String[] args) {

        String[][] book_time = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};

        int [][] arr = new int[book_time.length][2];
        for(int i = 0; i< book_time.length; i++) {
            arr[i][0] = Integer.parseInt(book_time[i][0].substring(0,2))*60 + Integer.parseInt(book_time[i][0].substring(3,5));
            arr[i][1] = Integer.parseInt(book_time[i][1].substring(0,2))*60 + Integer.parseInt(book_time[i][1].substring(3,5)) + 10;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        System.out.println("arr은 : "+Arrays.deepToString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int time = arr[0][1];
        list.add(arr[0][1]);
        stack.push(arr[0][1]);
        int index = 0;

        for(int i = 0; i<arr.length; i++) {
            if (arr[i][0] == -1) {
                continue;
            } else {
                time = arr[i][0];
                if (time >= stack.peek()) {
                    list.set(index, arr[i][1]);
                    int tempVal = arr[i][1];
                    for(int k = 0; k<list.size(); k++) {
                        if (list.get(k)<tempVal) {
                            tempVal = list.get(k);
                            index = k;
                        }
                    }
                    stack.pop();
                    stack.push(tempVal);
                } else {
                    for (int j = i; j < arr.length; j++) {
                        if (arr[j][0] < time) {
                            list.add(arr[j][1]);
                            arr[j][0] = -1;
                        }
                    }
                }
            }
        }

        System.out.println(list.toString());
        int answer = list.size();
        System.out.println(answer);

    }
}
