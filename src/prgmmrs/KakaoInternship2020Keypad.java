package prgmmrs;

import java.util.Arrays;

public class KakaoInternship2020Keypad {
    public static void main(String[] args) {
        int[] numbers ={0,5,8,2};
        String hand = "left";

        int [] left = {3,0};
        int [] right = {3,2};
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i<numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append("L");
                left[0] = numbers[i]/3;
                left[1] = 0;
                System.out.println(numbers[i]+" 들어와서 L찍힘, left[] = "+ Arrays.toString(left));
                System.out.println(sb.toString());
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                sb.append("R");
                right[0] = numbers[i]/4;
                right[1] = 2;
                System.out.println(numbers[i]+" 들어와서 R찍힘, right[] = "+ Arrays.toString(right));
                System.out.println(sb.toString());
            } else {
                if (numbers[i] == 0) {
                    numbers[i] = 11;
                }
                int temp = numbers[i]/3;  //2-0,5-1,8-2,11-3
                int lLen = Math.abs(temp-left[0])+Math.abs(1-left[1]);
                int rLen = Math.abs(temp-right[0])+Math.abs(1-right[1]);

                String a = "initial";
                if (lLen == rLen) {
                    a = hand.toUpperCase().substring(0,1);
                    System.out.println("lLen은 "+lLen+", rLen은 "+rLen+", 둘이 같음, a는 "+a);
                } else {
                    a = lLen > rLen ? "R" : "L";
                    System.out.println("lLen은 "+lLen+", rLen은 "+rLen+", a = "+a);
                }
                if (a.toLowerCase().equals("l")) {
                    left = new int[]{temp, 1};
                    System.out.println("left가 옮겨짐 "+Arrays.toString(left));
                } else {
                    right = new int[]{temp, 1};
                    System.out.println("right가 옮겨짐 "+Arrays.toString(right));
                }
                sb.append(a);
                System.out.println("lLen은 "+lLen+", rLen은 "+rLen);
                System.out.println(sb.toString());
            }
        }

        String answer = sb.toString();
        System.out.println(answer);
    }
}
