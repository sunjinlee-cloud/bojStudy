package prgmmrs;

public class PccpBandage {
    public static void main(String[] args) {
        int [] bandage = new int[] {1, 10, 10};
        int health = 5;
        int [][] attacks = new int[][] {{97, 4}, {99, 4}};

        int [] incoming = new int [attacks[attacks.length-1][0]+1];
        for (int i = 0; i< attacks.length; i++) {
            incoming[attacks[i][0]] = attacks[i][1];
        }

        int maxHealth = health;
        int continuousBandagingTime = 0;
        int answer = 0;

        for (int i = 0; i<incoming.length; i++) {
            if (health <1) {
                answer = -1;
                break;
            }
            if (incoming[i] != 0) {
                health -= incoming[i];
                continuousBandagingTime = 0;
            } else if(continuousBandagingTime == bandage[0]-1) {
                if (health>=maxHealth) {
                    continuousBandagingTime = 0;
                } else {
                    health += bandage[1];
                    health += bandage[2];
                    continuousBandagingTime = 0;
                    if (health > maxHealth) {
                        health = maxHealth;
                    }
                }
            } else {
                if (health>=maxHealth) {
                    continuousBandagingTime++;
                } else {
                    health += bandage[1];
                    continuousBandagingTime++;
                    if (health > maxHealth) {
                        health = maxHealth;
                    }
                }
            }
        }

        if (health < 1 ) {
            answer = -1;
        } else answer = health;
        System.out.println(answer);
    }
}
