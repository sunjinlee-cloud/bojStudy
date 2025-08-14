package prgmmrs;

public class rny_string {
    public static void main(String[] args) {
        String rny_string = "programmers";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<rny_string.length(); i++) {
            if(rny_string.charAt(i) == 'm') {
                sb.append("rn");

            }
            else sb.append(rny_string.charAt(i));
        }
        String answer = sb.toString();
        System.out.println(answer);
    }
}
