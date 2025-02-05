import java.util.Arrays;

// public class PartitionSubsetSum {
//     public static void main(String[] args) {
        
//     }public boolean canPartiion(int [] arr){
//         int n = arr.length;
//         int totalSum = 0 ;

//         for(int i:arr){
//             totalSum += arr[i];
//     }
    
//     if(totalSum%2==1){
//         return false;
        
//     }else{
//         int k = totalSum/2;
//         int dp[][]= new int [n][k+1];
//         for(int row[]: dp){
//             Arrays.fill(dp, -1);
//         }
//         return SubsetSumUntil(n - 1, k, arr, dp);

//      }

//     }public boolean SubsetSumUntil(int ind , int target , int arr[], int [][] dp){

//         if(target==0){
//             return true;
//         }
//         if (ind == 0)
//             return arr[0] == target;
//         if(dp[ind][target]!=-1){
//             return dp[ind][target]==0? false:true;
//         }
//         //not taking the current element into the subset

//         boolean notTaken = SubsetSumUntil(ind-1, target, arr, dp);

//         //taking the current element into the subset
//         boolean taken = false;
//         if(arr[ind]<=target){

//             boolean Taken= SubsetSumUntil(ind-1 , target-arr[ind], arr, dp);
//             dp[ind][target] = notTaken || taken ? 1 : 0;
//             return notTaken || taken;
//         }


//     }
// }
public class PartitionSubsetSum {

    public static void main(String[] args) {
        
    }public boolean subsetSumUtil(int idx, int target, int arr[], int[][] dp) {
      if(target==0){
        return true;
      }

      if(idx== 0){
        return arr[0] == target;
      }

      if(dp[idx][target]!=-1){
        return dp[idx][target]==0?false:true;
      } 

      boolean notTaken = subsetSumUtil(idx-1, target, arr, dp);

      boolean Taken = false;
      if(arr[idx]<=target){
        Taken = subsetSumUtil(idx-1, target-arr[idx], arr, dp);
      }

      dp[idx][target]= notTaken || Taken ? 1:0;
      return notTaken || Taken;






    }public boolean canPartition(int [] arr){
        int n = arr.length;
        int totalSum = 0;
        for(int i = 0 ; i< n ; i++){
            totalSum+=arr[i];
        }
// If the total sum is odd, it cannot be partitioned into equal subset
        if(totalSum %2==1){
            return false;
        }
        int dp[][] = new int [n][n+1];
        for(int row[]:dp){
            Arrays.fill(row, -1);
        }
        int target= totalSum/2;


        return subsetSumUtil(n-1 , target, arr, dp);
    }
}