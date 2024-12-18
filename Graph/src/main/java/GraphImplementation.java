import java.util.ArrayList;

/***
 * Undirected Graph implementation
 */


public class GraphImplementation {

    public static void main(String[] args) {

        int vertex = 5;
        ArrayList<ArrayList<Integer>> initGraph = new ArrayList<ArrayList<Integer>>();

        for(int i = 0 ; i < vertex ; i++)
        {
            initGraph.add(new ArrayList<Integer>());
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


    }

    static void addEdge(ArrayList<ArrayList<Integer>> initGraph, int v1, int v2)
    {
        System.out.printf("****** Adding edge %d ,%d ****** \n",v1,v2);
        initGraph.get(v1).add(v2);
        initGraph.get(v2).add(v1);

    }

}
