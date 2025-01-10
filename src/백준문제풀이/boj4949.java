import java.io.*;
import java.util.Stack;

public class boj4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            boolean isEqualized = true;
            String str = br.readLine();
            char[] arr = new char[100];
            Stack<Character> stack = new Stack<>();
            if (str.charAt(0) == '.') {
                break;
            } else {

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                        stack.push(str.charAt(i));
                    } else if (str.charAt(i) == ')') {
                        if (stack.empty()) {
                            bw.write("no");
                            bw.newLine();
                            isEqualized = false;
                            break;
                        } else {
                            char a = stack.peek();
                            if (a == '(') {
                                stack.pop();
                            } else {
                                bw.write("no");
                                bw.newLine();
                                isEqualized = false;
                                break;
                            }
                        }
                    } else if (str.charAt(i) == ']') {
                        if (stack.empty()) {
                            bw.write("no");
                            bw.newLine();
                            isEqualized = false;
                            break;
                        } else {
                            char a = stack.peek();
                            if (a == '[') {
                                stack.pop();
                            } else {
                                bw.write("no");
                                bw.newLine();
                                isEqualized = false;
                                break;
                            }
                        }
                    }
//                    else if (str.charAt(i) == '.') {
//                        break;
//                    }
                }
            }
            if (isEqualized && stack.empty()) {
                bw.write("yes");
                bw.newLine();
            } else if (isEqualized && !stack.empty()){
                bw.write("no");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
