public class mininSortedarr {
    public static void main(String[] args) {
        
    }public int findMin(int[] nums) {
        int start =0;
        int end  =nums.length-1;
        while (start<=end) {
            int mid = start+end/2;
            if(nums[mid]<nums[end]){
                end =mid;
            }else{
                start= mid+1;
            }           
        }
return nums[start];

    }
}
