import java.util.*;

public class DijkstraExample {
    static final int INF = Integer.MAX_VALUE;
    static int n = 6; // 노드 수
    static List<Node1>[] graph = new ArrayList[n + 1];
    static int[] dist = new int[n + 1];

    public static void dijkstra(int start) {
        PriorityQueue<Node1> pq = new PriorityQueue<>();
        Arrays.fill(dist, INF);
        dist[start] = 0;
        pq.offer(new Node1(start, 0));

        while (!pq.isEmpty()) {
            System.out.println();
            Node1 current = pq.poll();
            int now = current.to;
            int nowCost = current.cost;

            // 이미 처리한 더 짧은 경로가 있다면 skip
            if (nowCost > dist[now]) continue;

            for (Node1 next : graph[now]) {
                int nextNode = next.to;
                int nextCost = nowCost + next.cost;

                if (nextCost < dist[nextNode]) {
                    dist[nextNode] = nextCost;
                    pq.offer(new Node1(nextNode, nextCost));
                }
            }
        }
    }

    public static void main(String[] args) {
        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 양방향 간선 (문제에 따라 단방향이면 하나만 추가)
        graph[1].add(new Node1(2, 2));
        graph[1].add(new Node1(3, 1));
        graph[1].add(new Node1(4, 3));
        graph[2].add(new Node1(1, 2));
        graph[2].add(new Node1(5, 4));
        graph[2].add(new Node1(6, 6));
        graph[3].add(new Node1(1, 1));
        graph[3].add(new Node1(4, 1));
        graph[3].add(new Node1(5, 1));
        graph[4].add(new Node1(1, 3));
        graph[4].add(new Node1(3, 1));
        graph[4].add(new Node1(6, 2));
        graph[5].add(new Node1(2, 4));
        graph[5].add(new Node1(3, 1));
        graph[5].add(new Node1(6, 2));
        graph[6].add(new Node1(2, 6));
        graph[6].add(new Node1(4, 2));
        graph[6].add(new Node1(5, 2));

        // 다익스트라 실행 (시작 노드: 1)
        dijkstra(1);

        // 결과 출력
        for (int i = 1; i <= n; i++) {
            System.out.println("1번에서 " + i + "번까지 최단 거리: " + (dist[i] == INF ? "∞" : dist[i]));
        }
    }
}
