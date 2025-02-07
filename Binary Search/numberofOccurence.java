public class numberofOccurence {
    public int countFreq(int[] arr, int target) {
        int count =0 ;
        int start = 0;
        int end = arr.length-1;
 return upperBound(arr, target) - lowerBound(arr, target);
    }public static int lowerBound(int [] arr, int target){
        int n = arr.length;

        int start =0;
        int end = n-1;
        int ans = 0;

        while(start<=end){
            int mid = start+ (end -start)/2;
            if(arr[mid]>=target){
                ans = mid;
                end =mid-1;

            }else{
                start= mid+1;
            }
        }
        return ans;
    }public int upperBound(int []arr, int target){
        int n = arr.length;

        int start = 0;
        int end = arr.length-1;
        int ans = 0;

        while(start<=end){
            int mid = start+end/2;

            if(arr[mid]>target){
                ans = mid;
                end = mid-1;
            }else{
                start= mid+1;
            }

            
return ans;
        }
    }
}
