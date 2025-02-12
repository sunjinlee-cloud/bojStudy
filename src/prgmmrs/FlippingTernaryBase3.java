package prgmmrs;

public class FlippingTernaryBase3 {
    public static void main(String[] args) {
        int n = 125;

        StringBuilder sb = new StringBuilder("");
        while(n>0) {
            int a = n%3;
            sb.append(a);
            n/=3;
        }
        String num = sb.toString();
        int answer = Character.getNumericValue(num.charAt(num.length()-1));
        int a = 1;
        for (int i = sb.length()-2; i>=0; i--) {
            answer += (int) (Character.getNumericValue(num.charAt(i))*Math.pow(3,a));
            a++;
        }
        System.out.println(answer);

    }
}
