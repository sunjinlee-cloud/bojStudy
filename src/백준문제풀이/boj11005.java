package 백준문제풀이;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        while(N>0) {
            stack.push(N%B);
            N/=B;
            count ++;
        }

        while(!stack.empty()) {
            int a = stack.pop();
            if (a>9) {
                bw.write(String.valueOf((char)(a+55)));
            }
            else bw.write(String.valueOf(a));
        }
        bw.flush();
        bw.close();
    }
}
