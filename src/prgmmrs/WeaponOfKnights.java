package prgmmrs;

public class WeaponOfKnights {
    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;

        int answer = 0;
        int [] arr = new int [number+1];

        for (int i = 1; i<=number; i++) {
            for (int j = 1; j*i<=number; j++) {
                arr[j*i]++;
            }
        }

        for(int i = 1; i<arr.length; i++) {
            if (arr[i]>limit) {
                answer += power;
            } else {
                answer += arr[i];
            }
        }

    }
}
