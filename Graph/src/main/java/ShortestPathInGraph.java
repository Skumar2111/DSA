import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInGraph {

    public static void main(String[] args) {

        int vertex =5;
        int source = 0;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i = 0 ; i < vertex ; i++)
        {
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList,0,1);
        addEdge(adjList,0,2);
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);

        calculateShortestPatch(adjList, vertex, source);



    }

    private static void calculateShortestPatch(ArrayList<ArrayList<Integer>> adjList, int vertex, int source) {

        int[] distance = new int[vertex];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[source] = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertex];
        Arrays.fill(visited,false);

        queue.add(source);
        visited[source] = true;

        while(!queue.isEmpty()) {
            int u = queue.poll();

            for (int v : adjList.get(u)) {
                if (visited[v] == false) {
                    distance[v] = distance[u] + 1;
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }

       for(int i = 0 ; i < distance.length; i++)
       {
           System.out.println(distance[i]);
       }




    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

}
