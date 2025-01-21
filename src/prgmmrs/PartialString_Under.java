package prgmmrs;

public class PartialString_Under {
    public static void main(String[] args) {

        String t = "999999999999999999";
        String p = "999999999999999990";

        StringBuilder sb = new StringBuilder("");
        int pLen = p.length();
        int answer = 0;

        for (int i = 0; i<t.length()-p.length()+1;i++) {
            if (t.charAt(i) <= p.charAt(0)) {
                for (int j = 0; j<pLen; j++) {
                    sb.append(t.charAt(i+j));
                }
                String str = sb.toString();
                if (Long.parseLong(str) <= Long.parseLong(p)) {
                    answer++;
                }
                sb.delete(0,sb.length());

            }
        }
        System.out.println(answer);
    }
}
