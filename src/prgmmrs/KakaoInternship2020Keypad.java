package prgmmrs;

import java.util.Arrays;

public class KakaoInternship2020Keypad {
    public static void main(String[] args) {
        int[] numbers ={0,5,8,2};
        String hand = "left";

        int [] left = {3,0};
        int [] right = {3,2};
        StringBuilder sb = new StringBuilder("");

        //키패드를 2차원 배열로 옮긴다고 생각했을 때 4x3 배열로 만든다.
        //왼손과 오른손이 올라가 있는 키패드의 배열 위치를 포인터로 만들어 현재 위치를 확인한다.
        //(2,5,8,0)과의 위치 확인을 위함.

        //기본로직 :
        //1,4,7은 왼손으로 누르는 것 고정이므로 스트링빌더에 L 추가한 후, 왼손 포인터 값을
        //{1,4,7을 3으로 누른 값, 0} 으로 바꾼다.
        //3,6,9는 오른손으로 누르는 것 고정이므로 스트링빌더에 R 추가한 후, 오른손 포인터 값을
        //{3,6,9를 3으로 나눈 값 - 1, 2} 로 바꾼다.
        //2,5,8,0이 들어왔을 경우 각각의 배열 위치는 {0,1}, {1,1}, {2,1}, {3,1} 이므로
        //해당 배열 빼기 왼쪽포인터 값과 해당 배열 빼기 오른쪽포인터 값을 각각 구한 후
        //값이 적은 쪽의 포인터를 확인해 해당 포인터의 손가락 첫글자를 스트링빌더에 붙이고
        //해당 손가락 포인터 위치를 옮겨 준다.

        for(int i = 0; i<numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append("L");
                left[0] = numbers[i]/3;
                left[1] = 0;
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                sb.append("R");
                right[0] = numbers[i]/4;
                right[1] = 2;
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
                } else {
                    a = lLen > rLen ? "R" : "L";
                }
                if (a.toLowerCase().equals("l")) {
                    left = new int[]{temp, 1};
                } else {
                    right = new int[]{temp, 1};
                }
                sb.append(a);
            }
        }

        String answer = sb.toString();
        System.out.println(answer);
    }
}
