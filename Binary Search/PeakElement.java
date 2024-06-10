public class PeakElement {
    public static void main(String[] args) {
        
    } public int findPeakElement(int[] nums) {
      

        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+end/2;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                return mid;

            }else if(nums[mid]<nums[mid-1]){
                end = mid-1;
            }else if(nums[mid]<nums[mid+1]){
                start= mid+1;
            }
        } 
return -1;

    }
}
