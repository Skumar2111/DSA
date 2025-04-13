import java.util.Arrays;

class KrushkalsAlgorithm
{
    public static void main(String[] args) {

        int V = 4;
        int E = 5;
        Edge[] edges = new Edge[E];

        edges[0] = new Edge(10,0,1);
        edges[1] = new Edge(6,0,2);
        edges[2] = new Edge(5,0,3);
        edges[3] = new Edge(15,1,3);
        edges[4] = new Edge(4,2,3);

        Arrays.sort(edges);

        System.out.println(krushkalsMST(edges,V,E));


    }

    static int krushkalsMST(Edge[] edge, int V , int E)
    {
        int[] parent = new int[V];

        for(int i = 0 ; i < V ; i++)
        {
            parent[i] = i;
        }

        int u,v,cost,minCost = 0;

        for(int i = 0 ; i < E ; i++)
        {
            u = edge[i].u;
            v = edge[i].v;

            cost = edge[i].weight;

            if(findRoot(u,parent)!= findRoot(v,parent))
            {
                minCost = minCost + cost;
                unionSets(u,v,parent);
            }
        }

        return minCost;

    }

        private static void unionSets(int u, int v, int[] parent) {
        int p1 = findRoot(u,parent);

        int p2 = findRoot(v,parent);

        parent[p1] = parent[p2];
    }

    static int findRoot(int u , int[] parent)
    {
        while(parent[u] != u)
        {
            parent[u] = parent[parent[u]];
            u = parent[u];
        }

        return u;
    }
}

class Edge implements Comparable<Edge>
{
    int weight;

    int u , v;

    public Edge(int weight, int u, int v) {
        this.weight = weight;
        this.u = u;
        this.v = v;
    }


    @Override
    public int compareTo(Edge o) {
       if(this.weight > o.weight)
       {
           return 1;
       }
       return -1;
    }
}