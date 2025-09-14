import java.util.Scanner;

public class LargestSum {
    public static void main(String[] args) {
      //main Binary Search Function

      int high = 0;
      int low = 0;
      for(int i =0 ; i < arr.length ; i++){
        high+= arr[i];
        low = Math.max(low, arr[i]);
      }
      while(low<=high){
        int mid = low +(high-low)/2;

        if(findPartition(arr, mid)>k){
           low = mid+1;
        }else{
              high = mid-1;
        }

        return low;
      }
    }
    public static int findPartition(int arr [], int maxSum){
        int n = arr.length;
        int sumArraySum =0;
        int partition = 1;
        for(int i =0; i < n ; i++){
            if(sumArraySum+ arr[i]<=maxSum){
                sumArraySum+= arr[i];
            
            }else{
                sumArraySum = arr[i];
                 partition++;
            }
        }
        return partition;
    }
}
