package prgmmrs;

import java.util.Arrays;

public class ParkStrolling {
    public static void main(String[] args) {

        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        int [] location = new int[2];
        int w = park[0].length();
        int h = park.length;

        for (int i = 0; i< park.length; i++) {
            for (int j = 0; j<park[0].length(); j++) {
                char c = park[i].charAt(j);
                if (c=='S') {
                    location[0] = i;
                    location[1] = j;
                }
            }
        }


        boolean isThereX = false;
        int [] focus = {location[0], location[1]};

        for (int i = 0; i< routes.length; i++) {
            String [] temp = routes[i].split(" ");
            if (temp[0].equals("N") && 0<=location[0]-Integer.parseInt(temp[1])) {
                for (int j = 0; j<Integer.parseInt(temp[1]); j++) {
                   if (park[focus[0]-1].charAt(focus[1]) == 'X') {
                       isThereX = true;
                       break;
                    } else {
                       focus[0] --;
                   }
                }
                if (isThereX == false) {
                    location[0] -= Integer.parseInt(temp[1]);
                }
            } else if (temp[0].equals("S") && Integer.parseInt(temp[1])+location[0]<h) {
                for (int j = 0; j<Integer.parseInt(temp[1]); j++) {
                    if (park[focus[0]+1].charAt(focus[1]) == 'X') {
                        isThereX = true;
                        break;
                    } else {
                        focus[0] ++;
                    }
                }
                if (isThereX == false) {
                    location[0] += Integer.parseInt(temp[1]);
                }
            } else if (temp[0].equals("W") && 0<=location[1]-Integer.parseInt(temp[1])) {
                for (int j = 0; j<Integer.parseInt(temp[1]); j++) {
                    if (park[focus[0]].charAt(focus[1]-1) == 'X') {
                        isThereX = true;
                        break;
                    } else {
                        focus[1] --;
                    }
                }
                if (isThereX == false) {
                    location[1] -= Integer.parseInt(temp[1]);
                }
            } else if (temp[0].equals("E") && Integer.parseInt(temp[1])+location[1]<w){
                for (int j = 0; j<Integer.parseInt(temp[1]); j++) {
                    if (park[focus[0]].charAt(focus[1]+1) == 'X') {
                        isThereX = true;
                        break;
                    } else {
                        focus[1] ++;
                    }
                }
                if (isThereX == false) {
                    location[1] += Integer.parseInt(temp[1]);
                }
            }
            focus[0] = location[0];
            focus[1] = location[1];
            isThereX = false;
        }

        System.out.println(Arrays.toString(location));
    }
}
