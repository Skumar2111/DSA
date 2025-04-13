import java.util.ArrayList;

public class DirectedCyclic {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();
        int vertex = 5;

        for(int i = 0 ; i < vertex ; i++) {
            adjacencyList.add(new ArrayList<>());
        }


        /**
         *
         * addEdge skipped
         *
         */


        boolean[] visited = new boolean[vertex];


        for(int i = 0 ; i < vertex ; i++)
        {

            boolean[] recStack = new boolean[vertex];


            if(dfsRec(adjacencyList, 0 , visited , recStack))
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }
            break;

        }


    }

    private static boolean dfsRec(ArrayList<ArrayList<Integer>> adjacencyList, int source, boolean[] visited, boolean[] recStack) {

        visited[source] = true;
        recStack[source] = true;

        for( int v : adjacencyList.get(source))
        {
            if(visited[v] == false && dfsRec(adjacencyList,v,visited,recStack) == true)
            {
                return true;
            }
            else if(recStack[v] == true)
            {
                return true;
            }

        }
        recStack[source] = false;
        return false;
    }
}


