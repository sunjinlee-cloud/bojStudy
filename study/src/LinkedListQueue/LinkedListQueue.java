package LinkedListQueue;

public class LinkedListQueue implements Queue<Integer> {

    private Node<Integer> head;
    private Node<Integer> tail;
    private int size;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean offer(Integer i) {
        Node<Integer> newNode = new Node<Integer>(i);

        if (size == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;

        return true;
    }

    @Override
    public Integer poll() {

        int element;
        if (size == 0) {
            return -1;
        } else {
            element = head.value;
            head.value = null;
            head = head.next;
            size--;
        }
        return element;
    }

    @Override
    public Integer peek() {

        int element;
        if (size == 0) {
            return 0;
        } else {
            element = head.value;
        }
        return element;
    }

    public int size() {
        return size;
    }

    public int empty () {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int front() {
        if (size == 0) {
            return -1;
        } else {
            return head.value;
        }
    }

    public int back() {
        if (size == 0) {
            return -1;
        } else {
            return tail.value;
        }
    }
}
