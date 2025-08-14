//import java.io.*;
//import java.util.StringTokenizer;
//
//
//// 원형연결리스트 구현해보려고 했는데, 패키지 만들지 않고 그냥 이 파일에
//// 노드랑 연결리스트 클래스를 작성했더니, 메인함수에서 연결리스트 생성이 안됨.
//// 어느 부분을 잘못한건지 모르겠음.
//// 어딘가 다른곳에서 실수했다. -> ? 어딜지 감이 안잡힘
//// 나중에 좀더 배우고 다시 되짚어보기
//
//
//
//
//public class boj1158 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//
//
//
//        for (int i =0; i<n; i++) {
//
//        }
//
//    }
//}
//
//class Node<Integer> {
//    Integer value;
//    Node1<Integer> prev;
//    Node1<Integer> next;
//
//    Node(Integer i) {
//        this.value = i;
// //       this.prev = null;
//        this.next = null;
//    }
//}
//
//class MyLL<Integer> {
//    private Node1<Integer> head;
//    private Node1<Integer> tail;
//    private Node1<Integer> pointer;
//    private int size;
//
//    public MyLL () {
//        this.head = null;
//        this.tail = null;
//        this.pointer = null;
//        this.size = 0;
//    }
//
//    public void myLLAdd (Integer i) {
//        Node1<Integer> newNode = new Node1<>(i);
//
//        if (size == 0) {
//            head = newNode;
//            tail = newNode;
//            pointer = newNode;
//            size ++;
//        } else {
//
//            tail.next = newNode;
//            tail = newNode;
//            tail.next = head;
//            size ++;
//        }
//    }
//
//    public int myLLRemove (Integer value) {
//        if (size == 1) {
//            return (int) pointer.value;
//        } else {
//            int num = (int) value;
//            for (int j = 1; j < num - 1; j++) {
//                pointer = pointer.next;
//            }
//            if (pointer.next == tail) {
//                tail = pointer;
//            }
//            int val = (int) pointer.next.value;
//            pointer.next = pointer.next.next;
//            pointer = pointer.next;
//            size--;
//            return val;
//        }
//    }
//
//}







