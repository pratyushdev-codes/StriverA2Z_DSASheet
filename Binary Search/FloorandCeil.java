import java.util.*;
public class SearchInsertPos {

    public static void main(String[] args) {
        
    }public static int [] searchInsert(int arr[], int k) {
        Arrays.sort(arr);
        int floor =-1 , ceil = -1;
        int start =0;
        int end = arr.length=-1;
        while(start<=end){
            int mid= start+ (end-start)/2;
            if(arr[mid]==k){
                return new int[] {arr[mid], arr[mid]};
            }else if(arr[mid]<k){
                // this will be 
                floor = arr[mid];
                start =mid+1;
            }else{
                ceil= arr[mid];
                end = mid-1;
            }
        }

        return new int[]{floor, ceil};






    }
}