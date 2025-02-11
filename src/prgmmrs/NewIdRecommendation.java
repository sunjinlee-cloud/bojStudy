package prgmmrs;

public class NewIdRecommendation {
    public static void main(String[] args) {
        String new_id = "f...b";

        StringBuilder sb = new StringBuilder(new_id.toLowerCase());
        int i = 0;
        while(i<sb.length()) {
            if (sb.charAt(i)==45 || sb.charAt(i)==46 || (47<sb.charAt(i) && sb.charAt(i)<58)
                || sb.charAt(i)==95 ||(96<sb.charAt(i) && sb.charAt(i)<123) ) {
                i++;
            } else {
                sb.deleteCharAt(i);
            }
        }
        System.out.println("1번 "+sb.toString());
        i = 0;
        int k = 1;
        while (k<sb.length()) {
            if (sb.charAt(i)=='.' && sb.charAt(k)=='.') {
                sb.deleteCharAt(k);
            } else if (sb.charAt(i)!='.') {
                i++;
                k++;
            } else {
                i++;
                k++;
            }
        }
        System.out.println("2번"+sb.toString());
        if (sb.length()!=0) {
            while (sb.charAt(0) == '.' || sb.charAt(sb.length() - 1) == '.') {
                if (sb.length() == 0) break;
                if (sb.charAt(0) == '.') {
                    sb.deleteCharAt(0);
                }
                if (sb.length() == 0) break;
                if (sb.charAt(sb.length() - 1) == '.') {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        System.out.println("3번 "+sb.toString());
        if (sb.length()==0) sb.append("a");
        else if (sb.length()>15) {
            sb.delete(15, sb.length());
        }
        if (sb.charAt(sb.length()-1)=='.') {
            sb.delete(sb.length()-1, sb.length());
        }
        System.out.println("4번 "+sb.toString());
        if (sb.length()<3) {
            while(sb.length()<3) {
                sb.append(sb.charAt(sb.length()-1));
            }
        }
        String answer = sb.toString();
        System.out.println("최종 "+sb.toString());

    }
}


//45, 46, 48-57, 95, 97-122