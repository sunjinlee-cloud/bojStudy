package prgmmrs;

public class IntegerPairBetweenTwoCircles {
    public static void main(String[] args) {
        int r1 = 25;
        int r2 = 39;

        long dotsOnQuadrant = 0;
        for(int i = 1; i <= r2; i++) {
            for(int j = r2; j>=0; j--) {
                if (r1<=Math.sqrt(i*i+j*j) && Math.sqrt(i*i+j*j)<=r2) {
                    int x = (int) Math.sqrt(r1*r1 - i*i);
                    if(x>0) {
                        dotsOnQuadrant += j - x;
                    } else if (x == 0) {
                        dotsOnQuadrant += j+1;
                    } else dotsOnQuadrant += j;
                    //System.out.println("i값은 : "+i+", j값은 : "+j+", x값은 : "+x+", 1사분면 점갯수는 : "+dotsOnQuadrant);
                    break;
                } else if (Math.sqrt(i*i+j*j)<r1) {
                    break;
                }
            }
        }
        long answer = 4*dotsOnQuadrant;
        System.out.println(answer);
    }
}
