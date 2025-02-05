import java.util.*;
public class PartitionwithgivenDiff {
    public int MOD= (int)Math.pow(10, 9);
    public static void main(String[] args) {
        
    } public int countPartitions(int[] arr, int d) {
        int n = arr.length;
        int dp [][ ] = new int [n+1][n+1];
        for(int row []: dp){
            Arrays.fill(row, -1);
        }
        int totalSum = 0;
        for(int i =0; i< n ; i++){
            totalSum+= arr[i];
        }

        if(totalSum-d<0){
            return 0;
        }
        // as it is odd we can partition the arr//                                             
        if((totalSum-d)%2==1){
            return 0;

        }
        int s2 =(totalSum-d)/2;



    }public int SolvePartitions(int arr [], int target, int dp[][] , int idx){

        if(target==0){
            return 1;
        }
        if(idx==0){
            if(target==0 && arr[0]==0){
                return 2;
            }else if(target==0 || target==arr[0]){
                return 1 ;
            }
            return 0;
        }
        if(dp[idx][target]!=-1){
            return dp[idx][target];
        }

        int notTaken = SolvePartitions(arr, target , dp , idx-1);

        int Taken = 0;

        if(arr[idx]<= target){
            Taken =SolvePartitions(arr, target- arr[idx] , dp , idx-1);
        }


       return  dp[idx][target]= (Taken+ notTaken)%MOD;



         

    }
}
