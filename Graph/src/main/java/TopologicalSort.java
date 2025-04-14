import java.util.*;
import java.util.LinkedList;

public class TopologicalSort {

    public static void main(String[] args) {
        int vertex = 6
                ;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        for(int i = 0 ; i < vertex ; i++)
        {
            graph.add(new ArrayList<>());
        }

        addEdge(graph,5,2);
        addEdge(graph,5,0);
        addEdge(graph,4,0);
        addEdge(graph,4,1);
        addEdge(graph,2,3);
        addEdge(graph,3,1);

        topological(graph,vertex);

    }

    private static void topological(ArrayList<ArrayList<Integer>> graph,int vertex) {
        int[] in_degree = new int[vertex];
        Arrays.fill(in_degree,0);

        for(int i = 0 ; i < vertex ; i++)
        {
            ArrayList<Integer> temp = graph.get(i);

            for(int node : temp)
            {
                in_degree[node]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < vertex  ; i++)
        {
            if(in_degree[i] == 0)
            {
                queue.add(i);
            }
        }

        Vector<Integer> topOrder =  new Vector<>();
        while(!queue.isEmpty()) {
            int u = queue.poll();
            topOrder.add(u);

            for (int node : graph.get(u)) {
                if (--in_degree[node] == 0) {
                    queue.add(node);
                }
            }
        }
            for(int i : topOrder)
            {
                System.out.printf("%d  ",i);
            }


    }

    private static void addEdge(ArrayList<ArrayList<Integer>> graph , int u, int v) {
        graph.get(u).add(v);
    }

}
