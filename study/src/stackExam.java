import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class stackExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<N; i++) {
            String str = sc.nextLine();
            for (int k = 0; k<str.length(); k++) {
                if (stack.empty()&&str.charAt(k)=='(') {
                    stack.add(str.charAt(k));
                } else if (stack.empty()) {
                    stack.add(str.charAt(k));
                    break;
                }
                else {
                    if (str.charAt(k) == stack.peek()) {
                        stack.add(str.charAt(k));
                    }
                    else {stack.pop();}
                }
            }
            if (!stack.empty()) {
                System.out.println("NO");
            } else System.out.println("YES");
            stack.clear();
        }

    }
}
