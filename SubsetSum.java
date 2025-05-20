// Given an array of positive integers arr[] and a value target, determine if there is a subset of the given array with sum equal to given target. 
import java.util.*;
public class SubsetSum {

    public static void main(String[] args) {
        
    }public boolean isSubsetSum(int [] arr , int target){
        int sum = 0;
        int n = arr.length;

        int dp[][] = new int [n][n];
        Arrays.fill(dp, -1);

        return countSubset(arr, target, arr, sum, n, n-1);
    
    }public boolean countSubset(int [] arr , int target , int []dp , int sum, int n, int idx){
        if(dp[idx][target]!=-1){
            return dp[idx][target]==0? false: true;
        }

        if(target==0){
            return true;
        }
        if(idx==0){
            return arr[0]==target;
        }

        boolean notTaken = countSubset(arr, target, dp, n, idx-1);

        boolean Taken = false;
        if(arr[idx]<=target){
            Taken= countSubset(arr, target-arr[idx], dp , n , idx-1);
        }
        dp[idx][target]= notTaken || Taken?1:0;
        return notTaken || Taken;
    }
}
