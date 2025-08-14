public class Node1 implements Comparable<Node1> {
    int to;
    int cost;

    Node1(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node1 o) {
        return this.cost - o.cost; // 비용이 낮은 순 정렬
    }
}
