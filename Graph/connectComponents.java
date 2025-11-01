import java.util.*;

public class ConnectComponents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // number of nodes
        int m = sc.nextInt(); // number of edges

        // Initialize adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u); // because it's an undirected graph
        }

        boolean[] vis = new boolean[n];
        int components = 0;

        // Find connected components
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                components++;
                BFS(graph, i, vis);
            }
        }

        System.out.println("Number of connected components: " + components);
    }

    public static void BFS(ArrayList<ArrayList<Integer>> graph, int start, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int nbr : graph.get(node)) {
                if (!vis[nbr]) {
                    vis[nbr] = true;
                    q.add(nbr);
                }
            }
        }
    }
}
