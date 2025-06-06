// public class FirstandLastPositionElement {
//     public static void main(String[] args) {
        
//     }  public int firstOccurence(int[] nums, int target) {
//         int start = 0;
//         int end = nums.length-1;
//         int first = -1;
//         while(start<=end){
//             int mid = start+ (end-start)/2;
//             if(nums[mid]==target){
//                 return mid;
//                 end = mid-1;
//             }else if(nums[mid]<target){
//                 start= mid+1;
//             }else{
//                 end = mid-1;
//             }
//         }
// return first;

//     }public int lastOccurence(int [] nums ,int target){
//         int start = 0;
//         int last = -1;
//         int end = nums.length-1;

//         while(start<=end){
//            int mid = start+ (end-start)/2;
//            if(nums[mid]==target){
//             last = mid;
//             start = mid +1;
//            }else if(nums[mid]<target){
//                 start= mid+1;
//            }else{
//             end = mid-1;
//            }
//         }
//     }
// }


public class FirstandLastPositionElement {

    public static void main(String[] args) {
        
    }public static int findOccurence(int [] nums , int target, boolean isSearchingLeft){
        int start =0;
        int end = nums.length-1;

        int ans =0;
        while(start< end){
            int mid = start+ (end-start)/2;
            if(nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]< target){
                start = mid+1;
            }else{
                ans= mid;
   
            if(isSearchingLeft){
                end = mid-1;
            }else{
                start = mid+1;
            }
            }
       
   
        }
                 return ans;
    }public int [] searchRange(int []nums ,int target){
        int first = findOccurence(nums , target, true);
        int last= findOccurence(nums, target, false);

        return new int []{first, last};
    }
}