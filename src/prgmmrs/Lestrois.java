package prgmmrs;

public class Lestrois {
    public static void main(String[] args) {
        int[] number = {-1, 1, -1, 1};

        int answer = 0;
        int two = 0;
        for(int i = 0; i< number.length-2; i++) {
            for (int j = i+1; j< number.length-1; j++) {
                two = number[i] + number[j];
                for (int k = j+1; k<number.length; k++) {
                    if (two + number[k] == 0) {
                       answer ++;
                    }
                }
                two = 0;
            }
        }
        System.out.println(answer);
    }
}
