public class PaintersPartition {
    public static void main(String[] args) {
        // main binary Search function
        int low = 0;
        int high =0;
        for(int i =0; i < arr.length ; i++){
            high+= arr[i];
            low = Math.max( low , arr[i]);
        }
        while(low<=high){
            int mid = low +(high-low)/2;

            if(countPartitions(arr, mid)>k){
                low = mid+1;
            }else{
                high = mid-1;
            }

            return low;
        }
    }public static int countPartitions(int arr[], int mid){
        int painters =1;
        int sum =0;
        for(int i =0; i < arr.length ; i++){
            if(sum+arr[i]<=mid){
                sum+= arr[i];
            }else{
                painters++;
                sum = arr[i];
            }
        }
        return painters;
    }
}
