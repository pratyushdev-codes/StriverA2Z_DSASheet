// N = 7, x = 5 
// arr[] = {1,2,8,10,11,12,19}
// Output: 1
// Explanation: Largest Number less than 5 is
// 2 (i.e K = 2), whose index is 1(0-based 
// indexing).
public class FloorinBS {

    public static void main(String[] args) {
        
    }public static int findFloor(int target , int arr []){
    

        int start = 0;
        int end = arr.length;
        int ans = Integer.MAX_VALUE;

        int mid = (start+end)/2;

        while(end>start){
            if(target==arr[mid]){
                return mid ;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                ans = arr[mid];
                start= mid+1;

            }
        }
          return ans;
    }
}