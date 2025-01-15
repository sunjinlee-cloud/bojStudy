package prgmmrs;

public class Kakao24W_Present {
    public static void main(String[] args) {

        String [] friends = {"a", "b", "c"};
        String[] gifts = {"a b", "b a", "c a", "a c", "a c", "c a"};

        int [][] presentArr = new int[friends.length][friends.length];
        int [] willGetPresent = new int[friends.length];
        int [] presentPoint = new int[friends.length];

        for (int i = 0; i< gifts.length; i++) {
            String [] tempArr = gifts[i].split(" ");
            String giver = tempArr[0];
            String receiver = tempArr[1];

            exit :
            for (int j = 0; j< friends.length; j++) {
                for (int k = 0; k< friends.length; k++) {
                    if (giver.equals(friends[j]) && receiver.equals(friends[k])) {
                        presentArr[j][k] ++;
                        break exit;
                    }
                }
            }
        }

        for (int i = 0;i< friends.length; i++) {
            for (int j = 0; j< friends.length; j++) {
                    presentPoint[i] += presentArr[i][j];
                    presentPoint[i] -= presentArr[j][i];
            }
        }

        int answer = 0;
        for (int i = 0; i< friends.length-1; i++) {
            for (int j = i+1; j< friends.length; j++) {
                if (presentArr[i][j] > presentArr[j][i]) {
                    willGetPresent[i] ++;
                } else if (presentArr[i][j] < presentArr[j][i]) {
                    willGetPresent[j] ++;
                } else {
                    if (presentPoint[i]>presentPoint[j]) {
                        willGetPresent[i] ++;
                    } else if (presentPoint[i]<presentPoint[j]) {
                        willGetPresent[j] ++;
                    }
                }
            }
        }

        for (int i = 0; i<willGetPresent.length; i++) {
            if (answer<willGetPresent[i]) {
                answer = willGetPresent[i];
            }
        }

        System.out.println(answer);
    }
}
