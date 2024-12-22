import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSImplementation {

    public static void main(String[] args) {

        int vertex = 5;
        ArrayList<ArrayList<Integer>> initGraph = new ArrayList<ArrayList<Integer>>();

        for(int i = 0 ; i < vertex ; i++)
        {
            initGraph.add(new ArrayList<>());
        }

        addEdge(initGraph,0,1);
        addEdge(initGraph,0,2);
        addEdge(initGraph,1,2);
        addEdge(initGraph,1,3);

        System.out.println("Adjacency list graph representation");
        int index = 0;
        for (ArrayList<Integer> graph: initGraph) {
            System.out.println(graph);
        }

        System.out.println("BFS Traversal");
        BFS(initGraph,0,5);

    }


    public static void addEdge(ArrayList<ArrayList<Integer>> adjGraph , int u , int v)
    {
        adjGraph.get(u).add(v);
        adjGraph.get(v).add(u);
    }


    public static void BFS(ArrayList<ArrayList<Integer>> adjGraph, int source, int vertex)
    {
        boolean[] visited = new boolean[vertex + 1];
        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;

        queue.add(source);

        while(!queue.isEmpty())
        {
            int u = queue.poll();
            System.out.printf("-> %d",u);
            for(int v : adjGraph.get(u))
            {
                if(visited[v] == false)
                {
                    visited[v] = true;
                    queue.add(v);
                }
            }


        }
    }
}
