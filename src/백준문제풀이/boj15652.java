  import java.io.*;
import java.util.StringTokenizer;

public class boj15652 {
    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        check = new int[M];
        result = new int[M];

        backTrack(N, 0);

        bw.flush();
        bw.close();

    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static {
        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int [] check;
    static int [] result;

    static void backTrack(int N, int num) throws IOException {
        if (num == result.length) {
            for (int i = 0; i<result.length; i++) {
                bw.write(result[i]+" ");
            }
            bw.newLine();
            return;
        }
        for (int j = 0; j<N; j++) {
            result[num] = j+1;
            if (num>0 && result[num-1] > result[num]) {
                result[num] = 0;
                continue;
            } else {
                backTrack(N, num + 1);
            }
        }
    }
}
