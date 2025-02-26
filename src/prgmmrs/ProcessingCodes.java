package prgmmrs;

public class ProcessingCodes {
    public static void main(String[] args) {

        String code = "abc1abc1abc";

        boolean mode = false;
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i<code.length(); i++) {
            if (Character.getNumericValue(code.charAt(i)) == 1) {
                if (mode) mode = false;
                else mode = true;
                System.out.println("mode는 "+mode);
            } else {
                if (!mode) {
                    if (i%2 == 0) sb.append(code.charAt(i));
                } else {
                    if (i%2 == 1) sb.append(code.charAt(i));
                }
            }
        }
        String answer = sb.toString();
        if (answer.length() == 0) answer = "EMPTY";
        System.out.println(sb.toString());
    }
}
