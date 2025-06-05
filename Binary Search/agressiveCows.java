import java.util.Arrays;

public class agressiveCows {

    public static void main(String[] args) {
         int N = 6, k = 4;
         int arr[] = {0,3,4,7,10,9};
    }public int findMax(int arr [], int N , int K){
        int n = arr.length ;
        Arrays.sort(arr);
                int low = 1, high = arr[n - 1] - arr[0];
        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (check(arr, mid, K) == true) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return high;
    }public boolean check(int arr[], int N , int K, int dist){
        int n = arr.length;

        int cowCount =1;
        int last = arr[0];
        for(int i =0 ; i< n ; i++){

            cowCount++;
            last= arr[i];
        }

        if(cowCount>=K){
            return true;
        }
        return false;
    }
}
