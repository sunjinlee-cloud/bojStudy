package prgmmrs;

public class MakingHamburgers {
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int answer = 0;

        StringBuilder sb = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");

        for (int i = 0; i< ingredient.length; i++) {
            sb.append(ingredient[i]);
        }

        int pointer = 0;
        char [] chars = new char[4];
        while(pointer < sb.length()-3) {
            if (sb.charAt(pointer) == '1') {
                sb.getChars(pointer, pointer+4, chars,0);
                for (int k = 0; k<4; k++) {
                    sb2.append(chars[k]);
                }
                if (sb2.toString().equals("1231")) {
                    answer++;
                    sb.delete(pointer, pointer+4);
                    if (pointer<3) {
                        pointer = 0;
                    } else pointer -= 3;
                    System.out.println(sb.toString());
                    sb2.delete(0,sb2.length());
                } else {
                    pointer++;
                    sb2.delete(0,sb2.length());
                }
            }
            else {
                pointer ++;
            }
        }
        System.out.println(answer);
    }
}
