package prgmmrs;

public class TransportGoldAndSilver {
    public static void main(String[] args) {
        int a = 90;
        int b = 500;
        int[] g = {100,40,10};
        int[] s = {100,100,300};
        int[] w = {100,100,2};
        int[] t = {4,8,1};

        long longestTime = 0;
        long time = 1;

        while(a>=0 || b>=0) {
            for(int i = 0; i<t.length; i++) {
                if (time%t[i] == 0 && time/t[i]%2 == 1 ) {
                    Math.max(g[i], s[i]);
                }
            }
        }




        long answer = -1;

    }
}