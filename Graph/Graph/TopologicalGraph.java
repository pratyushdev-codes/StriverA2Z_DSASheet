import java.util.ArrayList;
import java.util.Stack;

public class TopologicalGraph {
     public  static void dfs(int node, int vis[], Stack<Integer> st,
            ArrayList<ArrayList<Integer>> adj) {
                
                    vis[node]= 1;

                    for(int i:adj.get(node)){
                        if(vis[i]==0){
                            dfs(i, vis, st, adj);
                        }

                        st.push(node);  

                    }


            }public int [] topoSort(int V, ArrayList<ArrayList<Integer>> adj){
                int vis[] = new int [V];
                Stack<Integer> st = new Stack<>(); 
                for(int i = 0; i<V; i++){
                    if(vis[i]==0){
                        dfs(i, vis, st, adj);
                    }
                }
                int ans [] = new int [V];
                int i=0;
                while(!st.isEmpty()){
                    ans[i] = st.pop();
                    i++;
                }

                return ans;
            }
}
