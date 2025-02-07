public class FirstandLastPositionElement {
    public static void main(String[] args) {
        
    }  public int firstOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int first = -1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(nums[mid]==target){
                return mid;
                end = mid-1;
            }else if(nums[mid]<target){
                start= mid+1;
            }else{
                end = mid-1;
            }
        }
return first;

    }public int lastOccurence(int [] nums ,int target){
        int start = 0;
        int last = -1;
        int end = nums.length-1;

        while(start<=end){
           int mid = start+ (end-start)/2;
           if(nums[mid]==target){
            last = mid;
            start = mid +1;
           }else if(nums[mid]<target){
                start= mid+1;
           }else{
            end = mid-1;
           }
        }
    }
}
