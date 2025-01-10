import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        int lastInserted = -1;

        for (int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "push":
                    int a = Integer.parseInt(st.nextToken());
                    queue.add(a);
                    lastInserted = a;
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        bw.write(String.valueOf(-1));
                        bw.newLine();
                    } else {
                        int b = queue.poll();
                        bw.write(String.valueOf(b));
                        bw.newLine();
                    }
                    break;
                case "size":
                    bw.write(String.valueOf(queue.size()));
                    bw.newLine();
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        bw.write("1");
                        bw.newLine();
                    }else {
                        bw.write("0");
                        bw.newLine();
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        bw.write("-1");
                        bw.newLine();
                    }else {
                        int c = queue.peek();
                        bw.write(String.valueOf(c));
                        bw.newLine();
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        bw.write("-1");
                        bw.newLine();
                    } else {
                        bw.write(String.valueOf(lastInserted));
                        bw.newLine();
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
