import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i<=N; i++) {
            queue.add(i);
        }

        while(queue.size()>1) {
            queue.poll();
            int a = queue.poll();
            queue.add(a);
        }
        System.out.println(queue.peek());

    }
}
