import java.util.Arrays;

public class PartitionSubsetSum {
    public static void main(String[] args) {
        
    }public boolean canPartiion(int [] arr){
        int n = arr.length;
        int totalSum = 0 ;

        for(int i:arr){
            totalSum += arr[i];
    }
    
    if(totalSum%2==1){
        return false;
        
    }else{
        int k = totalSum/2;
        int dp[][]= new int [n][k+1];
        for(int row[]: dp){
            Arrays.fill(dp, -1);
        }
        return SubsetSumUntil(n - 1, k, arr, dp);

     }

    }public boolean SubsetSumUntil(int ind , int target , int arr[], int [][] dp){

        if(target==0){
            return true;
        }
        if (ind == 0)
            return arr[0] == target;
        if(dp[ind][target]!=-1){
            return dp[ind][target]==0? false:true;
        }
        //not taking the current element into the subset

        boolean notTaken = SubsetSumUntil(ind-1, target, arr, dp);

        //taking the current element into the subset
        boolean taken = false;
        if(arr[ind]<=target){

            boolean Taken= SubsetSumUntil(ind-1 , target-arr[ind], arr, dp);
            dp[ind][target] = notTaken || taken ? 1 : 0;
            return notTaken || taken;
        }


    }
}
