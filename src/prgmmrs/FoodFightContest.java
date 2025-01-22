package prgmmrs;

public class FoodFightContest {
    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};

        StringBuilder sb = new StringBuilder("");
        for(int i = 1; i<food.length; i++) {
            if (food[i] %2 ==1) {
                for (int j = 0; j<(food[i]-1)/2; j++) {
                    sb.append(i);
                }
            } else {
                for (int j = 0; j<food[i]/2; j++) {
                    sb.append(i);
                }
            }
        }
        String lastHalf = sb.reverse().toString();
        String answer = sb.reverse().append(0).append(lastHalf).toString();
        System.out.println(answer);
    }
}
