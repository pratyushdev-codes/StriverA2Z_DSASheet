import java.util.PriorityQueue;

public class kthLargestElementinaStream {
  
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

 public KthLargest(int k, int[] nums) {
    int size=k;
    for(int i =0; i< nums.length; i++){
        minHeap.add(nums[i]);
    }
    if(minHeap.size()>k){
        minHeap.poll();
    }






}  public int add(int val) {

    minHeap.add(val);
    if(minHeap.size()>size){
        minHeap.poll();
    }
    return minHeap.peek();

}

}

