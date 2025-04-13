import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInUnWeighted {

    public static void main(String[] args) {
        int vertex = 8;
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i < vertex ; i++)
        {
            adjacencyList.add(new ArrayList<>());
        }
        GraphImplementation.addEdge(adjacencyList, 0, 1);
        GraphImplementation.addEdge(adjacencyList, 0,3);
        GraphImplementation.addEdge(adjacencyList, 1, 2);
        GraphImplementation.addEdge(adjacencyList, 3, 4);
        GraphImplementation.addEdge(adjacencyList, 3, 7);
        GraphImplementation.addEdge(adjacencyList, 4, 5);
        GraphImplementation.addEdge(adjacencyList, 4, 6);
        GraphImplementation.addEdge(adjacencyList, 4, 7);
        GraphImplementation.addEdge(adjacencyList, 5, 6);
        GraphImplementation.addEdge(adjacencyList, 6, 7);
        int[] distance = calculateDistanceBFS(adjacencyList,0,vertex);
        int index = 0;
        for (int dist:
             distance) {
            System.out.printf("Distance between source %d , and destination %d , is %d \n",0,index,dist);
            index++;
        }
    }

    private static int[] calculateDistanceBFS(ArrayList<ArrayList<Integer>> adjacencyList, int source , int vertex) {
        int[] distance = new int[vertex];
        Arrays.fill(distance,Integer.MAX_VALUE);
        boolean[] visited = new boolean[vertex];
        Arrays.fill(visited,false);
        visited[source] = true;
        distance[source] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        int u = source;
        while(!queue.isEmpty())
        {
           u = queue.poll();
            for(Integer v : adjacencyList.get(u))
            {
                if(visited[v] == false)
                {
                    distance[v] = distance[u] + 1;
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
       return distance;
    }
}
