import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


//'숫자 카드'문제인데 하다 말았음
//상근이의 카드들을 배열로 받아 정렬후 테스트될 카드들도 정렬로 받아 테스트할 숫자당
//상근카드 배열에서 숫자세고 다른숫자로 바뀔때 break걸면 될것같은데
//분류에 이진탐색은 왜있는것인지(어디에 쓸수있는지)

public class boj10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        int count = 0;



    }
}