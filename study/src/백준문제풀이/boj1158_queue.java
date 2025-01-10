import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1158_queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i<=N; i++) {
            queue.add(i);
        }

        int count = 1;
        bw.write("<");
        while (queue.size() != 1) {
            if(!queue.isEmpty() && count!=K) {
                int a = queue.poll();
                queue.add(a);
                count++;
            } else if (!queue.isEmpty() && count==K) {
                int a = queue.poll();
                count = 1;
                bw.write(a+", ");
            }
        }
        bw.write(queue.peek()+">");
        bw.flush();
        bw.close();
    }
}
