import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<N; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a > 0) {stack.push(a);}
            else {stack.pop();}
        }

        int sum = 0;
        if (stack.empty()) {
            System.out.println(sum);
        }
        else {
            while(!stack.empty()) {
                int b = stack.pop();
                sum += b;
            }
            System.out.println(sum);
        }
    }
}
