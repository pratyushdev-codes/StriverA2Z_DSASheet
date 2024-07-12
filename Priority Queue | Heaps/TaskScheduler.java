import java.util.ArrayList;
import java.util.PriorityQueue;

public class TaskScheduler {
    public static void main(String[] args) {
        
    }class Solution {
        public int leastInterval(char[] tasks, int p) {
            //building frequency map:-

            int [] freq = new int[26];
            for(char ch : tasks){
                freq[ch-'A']++;
            }
           
            //Max heap to store frequencies :-
            PriorityQueue<Integer>pq= new PriorityQueue<>();
            for(int i =0; i<26; i++){
                if(freq[i]>0){
                    pq.offer(freq[i]);

                }
            }
            int time =0;
            // Process tasks until the heap is empty
            while(!pq.isEmpty()){
                int cycle= p+1;
                List<Integer> store = new ArrayList<>();

                int taskCount =0;

                while(cycle-- > && !pq.isEmpty()){
                    
                }
            }


    



        }
    }





    
}
