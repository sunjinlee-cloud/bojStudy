package prgmmrs;

import java.util.Arrays;

public class EncryptedCodeOfTwo {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        char [] arr = new char[26-skip.length()];
        boolean isNotInSkip = true;
        int pointer = 0;
        for (char ch = 97; ch<123; ch++) {
            for (int i = 0; i<skip.length(); i++) {
                if (ch == skip.charAt(i)) {
                    isNotInSkip = false;
                    break;
                }
            }
            if (isNotInSkip) {
                arr[pointer] = ch;
                pointer++;
            }
            isNotInSkip = true;
        }

        String answer="";
        for (int i = 0; i<s.length(); i++) {
            for (int j = 0; j<arr.length; j++) {
                if ((char)s.charAt(i) == arr[j]) {
                    if (j+index >= arr.length) {
                        answer += arr[(j+index)%arr.length];
                    } else {
                        answer += arr[j+index];
                    }
                }
            }
        }
        System.out.println(answer);

    }
}
