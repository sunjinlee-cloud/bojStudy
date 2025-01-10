import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class day1223 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Stack <Integer> stack = new Stack<Integer>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                stack.add(num);
            }
            else if (str.equals("top")) {
                if (stack.empty()) {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                }
                else {
                    bw.write(String.valueOf(stack.peek()));
                    bw.newLine();}
            }
            else if (str.equals("size")) {
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            } else if (str.equals("empty")) {
                if (stack.empty())  {
                    bw.write(String.valueOf(1));
                    bw.newLine();
                }
                else {
                    bw.write(String.valueOf(0));
                    bw.newLine();
                }
            } else {
                if (stack.empty()) {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                }
                else {
                    bw.write(String.valueOf(stack.pop()));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
