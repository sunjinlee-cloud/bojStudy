package prgmmrs;

public class Coke {
    public static void main(String[] args) {
        int answer = 0;
        int a = 3;
        int b = 1;
        int n = 20;

        int rtn = 0;
        while(n>=a) {
            int freeCoke = (n / a) * b;
            rtn += freeCoke;
            n = n - (n / a) * a + freeCoke;
        }
    }
}