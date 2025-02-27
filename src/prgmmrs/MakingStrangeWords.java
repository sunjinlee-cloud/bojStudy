package prgmmrs;

public class MakingStrangeWords {
    public static void main(String[] args) {
        String s = "try hello world";
        String answer = null;

        String sl = s.toLowerCase();
        String su = s.toUpperCase();
        StringBuilder sb = new StringBuilder("");
        int index = 0;
        for(int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(" ");
                index = 0;
            } else {
                if (index % 2 ==0) {
                    sb.append(su.charAt(i));
                    index++;
                } else {
                    sb.append(sl.charAt(i));
                    index++;
                }
            }
        }
        answer = sb.toString();
        System.out.println(answer);

    }
}
