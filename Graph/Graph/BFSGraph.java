import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

public class BFSGraph {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //nodes input
    int m = sc.nextInt(); //edges input

    int [][] edges  = new int [m][2];
    for(int i = 0 ; i < m ; i++){
        edges[i][0] = sc.nextInt();
        edges[i][1]= sc.nextInt();
    }public void BFS(int m, int n , int [][] edges){
        List<List<Integer>> graph = constructGraph(n, m ,edges);
        boolean [] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0]= true;
        while(!q.isEmpty()){
            int rem = q.remove();
            List<Integer> nbrs= new ArrayList<>();
            for(int v:nbrs){
                if(!vis[v]){
                    vis[v]= true;
                    q.add(v);
                }
            }
        }
    }public List<List<Integer>> constructGraph(int n, int m , int edges[][]){
        List<List<Integer>> graph = new ArrayList<>();
        for(int i =0 ; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int edges []: graph){
            // or it can be written as 
            // int u = edges[1][0];
            // int v= edges[0][1];
            graph.get(edges[0]).add(edges[1]);  
            graph.get(edges[1]).add(edges[0]);
        }

    }
}
