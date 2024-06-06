public class UpperBoundBS {
    public static void main(String[] args) {
        
    }public static int upperBound(int target , int arr []){
    

        int start = 0;
        int end = arr.length;
        int ans = Integer.MAX_VALUE;

        int mid = (start+end)/2;

        while(end>start){
            if(target==arr[mid]){
                return mid ;
            }else if(target<arr[mid]){
                ans = arr[mid];
                end = mid-1;
            }else{
               
                start= mid+1;

            }
        }
          return ans;
    }
}

