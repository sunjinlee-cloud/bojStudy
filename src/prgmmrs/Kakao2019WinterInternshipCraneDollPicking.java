package prgmmrs;

import java.util.Stack;

public class Kakao2019WinterInternshipCraneDollPicking {
    public static void main(String[] args) {
        int[][] board = {{1, 0, 0, 0, 0}, {2, 0, 0, 0, 0}, {2, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {3, 0, 0, 0, 0}};
        int[] moves = {1,1,1,1};

        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for(int i = 0; i< moves.length; i++) {
            for (int j = 0; j< board.length; j++) {
                if (board[j][moves[i]-1] !=0) {
                    if (!stack.empty()) {
                        int temp = stack.peek();
                        System.out.println("좌표는 "+j+" "+(moves[i]-1)+", 값은 "+board[j][moves[i]-1]);
                        System.out.println("스택의 맨윗값은 "+stack.peek());
                        if (temp == board[j][moves[i]-1]) {
                            int p = stack.pop();
                            System.out.println("스택의 맨위값과 board값이 같아서 "+p+"를 꺼냄");
                            board[j][moves[i]-1] = 0;
                            answer+=2;
                        } else {
                            System.out.println("스택의 맨윗값은 "+stack.peek()+"이고 현재값은 "+board[j][moves[i]-1]+"라서 서로 다름, 그냥 스택에 값 넣음");
                            stack.push(board[j][moves[i]-1]);
                            board[j][moves[i]-1] = 0;
                        }
                    } else {
                        stack.push(board[j][moves[i]-1]);
                        System.out.println("스택이 비어있어서 "+board[j][moves[i]-1]+"을 넣음 ");
                        board[j][moves[i]-1] = 0;
                    }
                    break;
                }
                System.out.println("---------------------");
            }
        }
        System.out.println(answer);
    }
}