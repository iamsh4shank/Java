import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

class Graph {
    int nodes;
    int edges;
    boolean adjmatrix[][];
    LinkedList<Integer> adj[]; 
    ArrayList<Integer>[] adjNode;
    static int time = 1;
 
    Graph(int nodes) {
      this.nodes = nodes;
      edges = 0;
      adjmatrix = new boolean[nodes][nodes];
      adj = new LinkedList[nodes]; 
      for (int i=0; i<nodes; ++i) 
          adj[i] = new LinkedList(); 
    }
    Graph() {}

    void addEdge(ArrayList<ArrayList<Integer>> arrG, int node1, int node2) {
        //adding nodes to adjNode table  
        edges++;
        arrG.get(node1).add(node2);
        arrG.get(node2).add(node1);

        adjmatrix[node1][node2] = true;
        adjmatrix[node2][node1] = true;

        adj[node1].add(node2);
        
      }

    public void removeEdge(int node1, int node2) {
        adjmatrix[node1][node2] = false;
        adjmatrix[node2][node1] = false;
    }  
   
    void printGraph(ArrayList<ArrayList<Integer>> am) {
        for (int i = 0; i < am.size(); i++) {
        System.out.println("\nVertex " + i + ":");
            for (int j = 0; j < am.get(i).size(); j++) {
                System.out.print(" -> " + am.get(i).get(j));
            }
        System.out.println();
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodes; i++) {
          s.append(i + ": ");
          for (boolean j : adjmatrix[i]) {
            s.append((j ? 1 : 0) + " ");
          }
          s.append("\n");
        }
        return s.toString();
      }

      int nodes() {
        return nodes;
      }

    void BFS(int s) { 
        boolean visited[] = new boolean[nodes]; 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
        visited[s]=true; 
        queue.add(s); 
  
        while (queue.size() != 0){ 
            s = queue.poll(); 
            System.out.print(s+" ");  
            Iterator<Integer> i = adj[s].listIterator(); 
            while (i.hasNext()) { 
                int n = i.next(); 
                if (!visited[n]) { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    }
    
    void DFSUtil(int v,boolean visited[], int post[], int pre[]) { 
        pre[1] = time;
        time ++;
        visited[v] = true; 
        System.out.print(v+" "); 
        Iterator<Integer> i = adj[v].listIterator(); 
        while (i.hasNext()) { 
            int n = i.next(); 
            if (!visited[n]) 
                DFSUtil(n, visited, post, pre); 
        } 

        post[1] = time;
        System.out.println(pre[1] + ":"+post[1]);
    } 
  
    void DFS(int v, int post[], int pre[]) 
    { 
        boolean visited[] = new boolean[nodes]; 
        DFSUtil(v, visited, post, pre); 
    } 

    void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack, ArrayList<ArrayList<Integer> > adj) { 
        // Mark the current node as visited. 
        visited[v] = true; 
        Integer i; 
        // Recur for all the vertices adjacent 
        // to thisvertex 
        Iterator<Integer> it = adj.get(v).iterator(); 
        while (it.hasNext()) { 
        i = it.next(); 
        if (!visited[i]) 
        topologicalSortUtil(i, visited, stack, adj); 
        } 
        stack.push(new Integer(v)); 
        }

        void topologicalSort(ArrayList<ArrayList<Integer> > adj) 
    { 
        Stack<Integer> stack = new Stack<Integer>(); 
        boolean visited[] = new boolean[nodes]; 
        for (int i = 0; i < nodes; i++) 
            visited[i] = false; 
        for (int i = 0; i < nodes; i++) 
            if (visited[i] == false) 
                topologicalSortUtil(i, visited, stack,adj); 
        while (stack.empty() == false) 
            System.out.print(stack.pop() + " "); 
    }

}

class GraphDS {
    public static void main(String[] args) {
    Graph graph = new Graph(6);
    int V = 6;
    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++)
      am.add(new ArrayList<Integer>());

    // Add edges
    graph.addEdge(am, 1, 2);
    graph.addEdge(am, 2, 4);
    graph.addEdge(am, 1, 3);
    graph.addEdge(am, 3, 4);

    graph.addEdge(am, 2, 5);

    graph.printGraph(am);
    System.out.println();
    String x = graph.toString();
    System.out.println(x);

    graph.BFS(0);
    System.out.println();

    int pre[] = new int[2]; 
    int post[] = new int[2]; 

    //graph.DFS(0, post, pre);

    System.out.println();
    graph.topologicalSort(am);

    }
}
