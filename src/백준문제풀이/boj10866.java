import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "push_front":
                    int X = Integer.parseInt(st.nextToken());
                    deque.addFirst(X);
                    break;
                case "push_back":
                    int Y = Integer.parseInt(st.nextToken());
                    deque.addLast(Y);
                   break;
                case "pop_front":
                    if (deque.isEmpty()) {
                        bw.write("-1");
                        bw.newLine();
                    } else {
                        int a = deque.pollFirst();
                        bw.write(String.valueOf(a));
                        bw.newLine();
                    }
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        bw.write("-1");
                        bw.newLine();
                    } else {
                        int a = deque.pollLast();
                        bw.write(String.valueOf(a));
                        bw.newLine();
                    }
                    break;
                case "size":
                    bw.write(String.valueOf(deque.size()));
                    bw.newLine();
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        bw.write("1");
                        bw.newLine();
                    } else {
                        bw.write("0");
                        bw.newLine();
                    }
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        bw.write("-1");
                        bw.newLine();
                    } else {
                        bw.write(String.valueOf(deque.peekFirst()));
                        bw.newLine();
                    }
                    break;
                default :
                    if (deque.isEmpty()) {
                        bw.write("-1");
                        bw.newLine();
                    } else {
                        bw.write(String.valueOf(deque.peekLast()));
                        bw.newLine();
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
