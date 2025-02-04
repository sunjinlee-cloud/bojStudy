package prgmmrs;

public class HowMuchMoneyDoWeNeedMore {
    public static void main(String[] args) {

        int price = 3;
        int money = 20;
        int count = 4;

        long m = money;
        for(int i = 1; i<=count; i++) {
            m -= price*i;
        }

        long answer = m>0? 0: -m;
        System.out.println(answer);
    }
}
