import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 체스판 다시 칠하기인데 못해먹겠음


public class boj1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char [][] arr = new char[N][];
        for (int i = 0; i<N; i++) {
            for (int j = 0; i<M; j++) {
                arr[i][j] = br.readLine().charAt(j);
            }
        }

        char [][] arrB = new char[N][];
        for (int i = 0; i<8; i++) {
            for (int j = 0; i<8; j++) {
                if ((i+j)%2==0) {arr[i][j] = 'B';
                } else {
                    arr[i][j] = 'W';
                }
            }
        }

        char [][] arrW = new char[N][];
        for (int i = 0; i<8; i++) {
            for (int j = 0; i<8; j++) {
                if ((i+j)%2==0) {arr[i][j] = 'W';
                } else {
                    arr[i][j] = 'B';
                }
            }
        }

        int count = 0;
        int minCount = 64;

//        for (int i = 0; i <= N - 8; i++) {
//            for (int j = i; j < i + 8; j++) {
//                for (int k = 0; k <= M - 8; k++) {
//                    for (int l = k; l < k + 8; l++) {
//                        if
//                    }
//                }
//            }
//        }
    }
}

