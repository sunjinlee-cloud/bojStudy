package prgmmrs;

import java.util.Arrays;
import java.util.HashMap;

public class kakao23BlindRecruitment_PrivateInfoExpiringDate {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        int todayNum = Integer.parseInt(today.substring(0,4))*12*28
                + Integer.parseInt(today.substring(5,7))*28
                + Integer.parseInt(today.substring(8,10));
        int [] privacyNum = new int[privacies.length];
        for (int i = 0; i<privacies.length; i++) {
            privacyNum[i] = Integer.parseInt(privacies[i].substring(0,4))*12*28
                    + Integer.parseInt(privacies[i].substring(5,7))*28
                    + Integer.parseInt(privacies[i].substring(8,10))-1;
        }
//        System.out.println("연월일 일수로 합친 배열 :"+Arrays.toString(privacyNum));
//        System.out.println("기준일 : "+todayNum);

        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i< terms.length; i++) {
            String [] temp = terms[i].split(" ");
            hashMap.put(temp[0], temp[1]);
        }

        int numOfExpired = 0;
        int [] arr = new int[privacies.length];
        for (int i = 0; i<privacies.length; i++) {
            String temp = privacies[i].substring(11);
            privacyNum[i] += Integer.parseInt(hashMap.get(temp))*28;
            if (privacyNum[i] < todayNum) {
                arr[i] = 1;
                numOfExpired ++;
            }
        }
//        System.out.println("약관별 개월수 합친 값 : "+Arrays.toString(privacyNum));
//        System.out.println(Arrays.toString(arr));

        int [] answer = new int[numOfExpired];
        int p = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 1) {
                answer[p] = i+1;
                p++;
            }
        }

        System.out.println(Arrays.toString(answer));

    }

    public static int to_days(String str) {
        int sum = Integer.parseInt(str.substring(0,4))*12*28
                + Integer.parseInt(str.substring(5,7))*28
                + Integer.parseInt(str.substring(8,10));
        return sum;
    }
}
