// public class PeakElement {
//     public static void main(String[] args) {
        
//     } public int findPeakElement(int[] nums) {
      

//         int start = 0;
//         int end = nums.length-1;
//         while(start<=end){
//             int mid = start+end/2;
//             if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
//                 return mid;

//             }else if(nums[mid]<nums[mid-1]){
//                 end = mid-1;
//             }else if(nums[mid]<nums[mid+1]){
//                 start= mid+1;
//             }
//         } 
// return -1;

//     }
// }
public class PeakElement {

    public static void main(String[] args) {
        
    }   public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n<1) return -1;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0
        if(nums[n-1]>nums[n-2]) return n-1;


    }
}

