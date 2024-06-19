public class MaximumConcequtiveOnesIII {
    public static void main(String[] args) {
        
    }public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int zeros=0;
      
        while(start<end){
            if(nums[end]==0){
                zeros++;
            }
            end++;
        }if(zeros>k){
            if(nums[start]==0){
                zeros--;
            }
            start++;
        }





return end- start;

    }
}
