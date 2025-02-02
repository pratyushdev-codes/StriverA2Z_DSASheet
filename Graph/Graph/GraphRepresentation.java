import java.util.ArrayList;

public class GraphRepresentation {
    public static void main(String[] args) {
        public List<List<Integer>> printGraph(int V , int edges[][]){
            List<List<Integer>> graph = new ArrayList<>();
            for(int i = 0 ; i < V ; i++){
                graph.add(new ArrayList<>()); // creating a list like structure on each level
            }

            for(int i[]:edges){
                int u = i[0];
                int v = i[1];
                graph.get(u).add(v);
                graph.get(v).add(u);

                // or we can do this also

                graph.get(i[0]).add(i[1]);
                graph.get(i[1]).add(i[0]);
            }
        }
    }

}
