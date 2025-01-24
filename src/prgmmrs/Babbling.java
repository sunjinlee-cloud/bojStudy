package prgmmrs;

public class Babbling {
    public static void main(String[] args) {

        int answer = 0;
        String [] arr = {"aya", "ye", "woo", "ma"};
        String [] babbling = {"yayae"};

        int pointer = -1;
        boolean isChanged = false;
        for(int i = 0; i< babbling.length; i++) {
            exit :
            while(true) {
                for (int j = 0; j<arr.length; j++) {
                    if (babbling[i].isEmpty()) {
                        answer++;
                        break exit;
                    }
                    else if (arr[j].charAt(0) == babbling[i].charAt(0)) {
                        if (pointer == j) {
                            continue;
                        } else if (babbling[i].length()<arr[j].length()) {
                            continue;
                        } else {
                            String temp = babbling[i].substring(0, arr[j].length());
                            if (temp.equals(arr[j])) {
                                babbling[i] = babbling[i].substring(arr[j].length());
                                pointer = j;
                                isChanged = true;
                                break;
                            }
                        }
                    }
                }
                if (!isChanged) {
                    break;
                }
                isChanged = false;
            }
            pointer = -1;
        }
        System.out.println(answer);
    }
}
