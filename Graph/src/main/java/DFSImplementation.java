import java.util.ArrayList;

public class DFSImplementation {

    public static void main(String[] args) {

        int v = 5;
        int source = 0;
        
        ArrayList<ArrayList<Integer>> adjGraph = new ArrayList<ArrayList<Integer>>();

        for(int i = 0 ; i < v ;i ++)
        {
            adjGraph.add(new ArrayList<>());
        }

        addEdge(adjGraph,0,1);
        addEdge(adjGraph,0,2);
        addEdge(adjGraph,1,2);
        addEdge(adjGraph,1,3);

        System.out.println("Adjacency list graph representation");
        for (ArrayList<Integer> graph: adjGraph) {
            System.out.println(graph);
        }
        DFS(adjGraph,source,v);

    }

    private static void DFS(ArrayList<ArrayList<Integer>> adjGraph, int source, int v) {

        boolean visited[] = new boolean[v + 1];
        DfsRec(adjGraph, source, visited);
    }

    private static void DfsRec(ArrayList<ArrayList<Integer>> adjGraph, int source, boolean[] visited) {

        visited[source] = true;
        System.out.println(source);
        for(int u : adjGraph.get(source))
        {
            if(visited[u] == false)
            {
                DfsRec(adjGraph,u,visited);
            }
        }
    }

    public static void  addEdge(ArrayList<ArrayList<Integer>> adjGraph,int u , int v)
    {
        adjGraph.get(u).add(v);
        adjGraph.get(v).add(u);
    }

}
