public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        
    }    public int search(int[]arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(end>=start){
            int mid = start+ (end-start)/2;


            if(arr[mid]==target){
                return mid;
            }

            if(arr[start]<=arr[mid]){
                if(arr[start]<=target && target<= arr[mid]){
                    end = mid-1;
                }else{
                    start= mid+1;
                }
            }else{
                if(arr[mid]<=target && target<=arr[end]){
                    start= mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;


    }
}
