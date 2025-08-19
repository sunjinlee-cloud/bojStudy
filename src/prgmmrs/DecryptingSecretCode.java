package prgmmrs;

import java.util.ArrayList;
import java.util.List;

public class DecryptingSecretCode {
    static int n = 15;
    static int[][] q = {{2, 3, 9, 12, 13}, {1, 4, 6, 7, 9}, {1, 2, 8, 10, 12}, {6, 7, 11, 13, 15}, {1, 4, 10, 11, 14}};
    static int[] ans = {2,1,3,0,1};
    static int answer = 0;

    public static void main(String[] args) {

        //백트래킹으로 정수 5개짜리 배열 만들어 나가면서 q[i]와 ans[i] 개의 원소 일치하는지 보기
        //int[5]는 쓰기 불편하므로 List<Integer>에 붙였다 뗐다 하면서 정수 5개짜리 배열 만든다.
        //백트래킹 함수는 List에 원소 하나씩 붙여나가고, List 길이가 5일때 q[i]와 원소 개수 일치하는지를 확인한다.
        backtrack(1, new ArrayList<>());
        System.out.println(answer);

    }

    public static void backtrack(int start, List<Integer> list) {
        if(list.size() == 5) {
            if(check(list, q, ans, answer)) {
                answer++;
            }
            return;
        }

        for(int i = start; i<=n; i++) {
            list.add(i);
            backtrack(i+1, list);
            list.remove(list.size() - 1);
        }
    }

    public static boolean check(List<Integer> list, int[][] q, int[] ans, int answer) {
        for(int i = 0; i<q.length; i++) {
            int match = 0;
            for(int j = 0; j<5; j++) {
                if(list.contains(q[i][j])) match++;
            }
            if(match != ans[i]) {
                return false;
            }
        }
        return true;
    }
}
