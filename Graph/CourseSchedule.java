import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    public static void main(String[] args) {
        
    } public boolean canFinish(int V, int[][] graph) {
        int [] arr = new int [V];
        func(arr, graph);

        Queue<Integer> q= new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.poll();
            list.add(curr);
            for(int i = 0 ; i<graph.length ; i++){
                arr[graph[i][0]]--;
                if(arr[graph[i][0]]==0){
                    q.add(graph[i][0]);
                }
            }
        }

        if(list.size()!=V){
            return false;
        }else{
            return true;
        }

    }public void func(int [] arr, int [][] graph){
        for(int i = 0 ; i<graph.length ; i++){
            arr[graph[i][0]]++;

        }
    }
}
