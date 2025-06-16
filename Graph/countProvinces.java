import java.util.ArrayList;

class countProvinces{
    public static void main(String Args []){

    }public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i =0 ; i < n ; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0 ; i < n ; i++){
           for(int j = 0 ; j < n; j++){
            if(isConnected[i][j]==1 && i!=j){
                graph.get(i).add(j);
                graph.get(j).add(i);
            
                       }           }
        }
int vis [] = new int [n];
int count =0;
for(int i = 0 ; i < n ; i++){
    if(vis[i]==0){
        DFS(graph , i , vis);
        count++;
    }
}
return count;

    }

        // we will do BFS here and increament the count
    }public void DFS(ArrayList<ArrayList<Integer>> graph, int currNode, int [] vis){
            vis[currNode]=1;
            for(int nbr : graph.get(currNode)){
                if(vis[nbr]==0){
                    DFS(graph, nbr, vis);
                }
            }
    }
            
    
