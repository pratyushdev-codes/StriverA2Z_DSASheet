import java.util.HashMap;

public class BinarySubarraywithSum {
    public static void main(String[] args) {
        
    }public int numSubarraysWithSum(int[] nums, int goal) {
        int count =0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum= sum+ nums[i];

            if(sum==goal){
                count ++;

            }if(hm.containsKey(sum-goal)){
                count+= hm.get(sum);
            }if(hm.containsKey(sum)){
                hm.put(sum, hm.get(sum)+1);
            }else{
                hm.put(sum, 1);
            }
        }
        return count;


    }
}
