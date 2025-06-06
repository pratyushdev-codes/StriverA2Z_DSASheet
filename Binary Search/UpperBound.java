public class UpperBound {
    public static void main(String[] args) {
        
    }public class int findUpperBound(int arr [], int k){
        int start =0;
        int end = arr.length-1;
        int ans = 0;
        while(start<end){
            int mid = start+ (end-start)/2;


            if(arr[mid]>k){
                ans = mid;
                end= mid;
            }else{
                start = mid+1;
            }

        }
        return ans ;
    } 
   

}
