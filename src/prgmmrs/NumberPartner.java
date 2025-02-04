package prgmmrs;

import java.util.Arrays;

public class NumberPartner {
    public static void main(String[] args) {
        String X = "100";
        String Y = "2345";

        int [] x = new int[10];
        int [] y = new int[10];

        for(int i = 0; i<X.length(); i++) {
            x[X.charAt(i)-48] ++;
        }
        for(int i = 0; i<Y.length(); i++) {
            y[Y.charAt(i)-48] ++;
        }

        StringBuilder sb = new StringBuilder("");
        for (int i = 9; i>=0; i--) {
            if (i == 0 && sb.length() ==0 && Math.min(x[i], y[i])>=2) {
                sb.append(0);
            } else {
                int a = Math.min(x[i], y[i]);
                if (a == 0) {
                    continue;
                } else {
                    for (int j = 0; j < a; j++) {
                        sb.append(i);
                    }
                }
            }
        }
        String answer = sb.length() == 0 ? "-1" : sb.toString();
        System.out.println(answer);
    }
}
