import java.util.*;

public class BFSGraph {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of nodes
        int m = sc.nextInt(); // Number of edges

        int[][] edges = new int[m][2];
        for (int i = 0; i < m; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        
        sc.close(); // Closing scanner to avoid resource leak

        BFSGraph graph = new BFSGraph();
        graph.BFS(n, edges);
    }

    public void BFS(int n, int[][] edges) {
        List<List<Integer>> graph = constructGraph(n, edges);
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0); // Assuming BFS starts from node 0
        vis[0] = true;

        while (!q.isEmpty()) {
            int rem = q.poll(); // Get the next node in the queue
            System.out.print(rem + " "); // Printing BFS traversal order

            for (int v : graph.get(rem)) { // Get neighbors from adjacency list
                if (!vis[v]) {
                    vis[v] = true;
                    q.add(v);
                }
            }
        }
    }

    public List<List<Integer>> constructGraph(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u); // Assuming an undirected graph
        }

        return graph; // Return the constructed adjacency list
    }
}
