import java.util.*;

class Dijkstra {
    static class Node implements Comparable<Node> {
        int vertex, weight;
        Node(int v, int w) { vertex = v; weight = w; }

        public int compareTo(Node other) {
            return this.weight - other.weight;
        }
    }

    void dijkstra(List<List<Node>> graph, int src) {
        int V = graph.size();
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(src, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.vertex;

            for (Node neighbor : graph.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;

                if (dist[v] > dist[u] + weight) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Node>> graph = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(new Node(1, 10));
        graph.get(0).add(new Node(4, 5));
        graph.get(1).add(new Node(2, 1));
        graph.get(1).add(new Node(4, 2));
        graph.get(2).add(new Node(3, 4));
        graph.get(3).add(new Node(0, 7));
        graph.get(3).add(new Node(2, 6));
        graph.get(4).add(new Node(1, 3));
        graph.get(4).add(new Node(2, 9));
        graph.get(4).add(new Node(3, 2));

        new Dijkstra().dijkstra(graph, 0);
    }
}
