package prgmmrs;

public class IntStringAndWords {
    public static void main(String[] args) {
        String s = "123";

        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder("");

        while(sb.length()!=0) {
            char a = sb.charAt(0);
            if (47<a && a<58) {
                ans.append(a);
                sb.delete(0,1);
            } else {
                if(a == 'z') {
                    ans.append(0);
                    sb.delete(0,4);
                } else if(a == 'o') {
                    ans.append(1);
                    sb.delete(0,3);
                } else if(a == 't') {
                    if (sb.charAt(1) == 'w') {
                        ans.append(2);
                        sb.delete(0,3);
                    } else {
                        ans.append(3);
                        sb.delete(0, 5);
                    }
                } else if (a == 'f') {
                    if (sb.charAt(1) == 'o') {
                        ans.append(4);
                        sb.delete(0,4);
                    } else {
                        ans.append(5);
                        sb.delete(0,4);
                    }
                } else if (a == 's') {
                    if (sb.charAt(1) == 'i') {
                        ans.append(6);
                        sb.delete(0,3);
                    } else {
                        ans.append(7);
                        sb.delete(0,5);
                    }
                } else if(a == 'e') {
                    ans.append(8);
                    sb.delete(0,5);
                } else if(a == 'n') {
                    ans.append(9);
                    sb.delete(0,4);
                }
            }
        }
        int answer = Integer.parseInt(ans.toString());
        System.out.println(answer);
    }
}
