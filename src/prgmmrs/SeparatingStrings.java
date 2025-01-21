package prgmmrs;

public class SeparatingStrings {
    public static void main(String[] args) {

        String s = "abracadabra";
        int answer = 0;

        exit : while(true) {
            char x = s.charAt(0);
            int numX = 1;
            int numY = 0;
            if (s.length() == 1) {
                answer++;
                break;
            }
            for (int i = 1; i < s.length(); i++) {
                if (numX == numY) {
                    s = s.substring(i);
                    answer++;
                    break;
                } else if (i == s.length()-1) {
                    answer++;
                    break exit;
                } else if (s.charAt(i) != x) {
                    numY++;
                } else {
                    numX++;
                }
            }
        }
        System.out.println(answer);
    }
}
