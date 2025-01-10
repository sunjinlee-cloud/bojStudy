import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj15649 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        check = new boolean[N+1];
        arr = new int[M];

        backTrack(check, N, M, 0);

        bw.flush();
        bw.close();
    }

    static boolean [] check;
    static int [] arr;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void backTrack(boolean [] check, int N, int M, int num) throws IOException {
        if (num == M)
        {
            for (int val : arr) {
                bw.write(val+" ");
            }
            bw.newLine();
            return;
        }
        for (int i = 0; i<N; i++) {
            if (!check[i]) {
                arr[num] = i+1;
                check[i] = true;
                backTrack(check, N, M, num+1);
                check[i] = false;
            }
        }
    }
}

/*
요점 :
답을 넣을 어레이에 들어갈 인덱스는 0부터 시작해야함. 중간에 ++; 를 하게 되는 경우 초기화시킬
포인트 찾기가 쉽지 않음.

for문을 넣어주면 항상 시작할 때 인덱스를 0부터 돌 수 있다.
상수에 0 넣고 돌 때마다 상수값 변경시키고 할 필요 없음.

어쨌든 가장 중요한 점은 어딘가 마킹을 해두고 마크된 곳은 넘어간다는 것임 -> 얼어죽을 유효함수

빠져나갈 때도 한 단계씩 빠져나가기 때문에 바로 윗 단계만 초기화해주는 구문을 넣어도
다 빠져나오고 나면 모든 단계가 다 초기화되어 있다.
 */
