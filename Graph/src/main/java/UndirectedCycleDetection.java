import java.lang.reflect.Array;
import java.util.ArrayList;

public class UndirectedCycleDetection {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();
        int vertex = 5;
        for(int i = 0 ; i < vertex ; i++)
        {
            adjacencyList.add(new ArrayList<Integer>());
        }

        /*Initialize graph*/

        GraphImplementation.addEdge(adjacencyList , 0   , 1 );
        GraphImplementation.addEdge(adjacencyList , 1   , 2 );
        GraphImplementation.addEdge(adjacencyList , 2   , 3 );
        GraphImplementation.addEdge(adjacencyList , 3   , 1 );

        boolean[] visited = new boolean[vertex];
        for(int i = 0 ; i < vertex ; i++)
        {
            if(visited[i] == false) {
                System.out.println(dfsRec(adjacencyList, i, visited, -1));
            }
            }

    }

    private static boolean dfsRec(ArrayList<ArrayList<Integer>> adjacencyList, int source, boolean[] visited, int parent) {

        visited[source] = true;

        for(int v : adjacencyList.get(source))
        {
            if(visited[v] == false)
            {
                if(dfsRec(adjacencyList,v,visited,source)== true)
                {
                    return true;
                }
            }
            else if(v != parent)
            {
                return true;
            }

        }

        return false;
    }


}
