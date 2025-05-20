
// 494. Target Sum
// Solved
// Medium
// Topics
// Companies
// You are given an integer array nums and an integer target.

// You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

// For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
// Return the number of different expressions that you can build, which evaluates to target.

 

// Example 1:

// Input: nums = [1,1,1,1,1], target = 3
// Output: 5
// Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
// -1 + 1 + 1 + 1 + 1 = 3
// +1 - 1 + 1 + 1 + 1 = 3
// +1 + 1 - 1 + 1 + 1 = 3
// +1 + 1 + 1 - 1 + 1 = 3
// +1 + 1 + 1 + 1 - 1 = 3

import java.util.*;
public class targetSum {
    public static void main(String[] args) {
        
    }public int findTargetSumWays(int[] nums, int target) {
        int n =nums.length;
        int dp[][] = new int [n+1][n+1];

        for(int row []: dp){
            Arrays.fill(dp , -1);
        }

        int totalSum= 0;
        for(int i = 0 ;i< n; i++){
            totalSum+= nums[i];
        }

        int s2 = (totalSum- target)/2;
        

    }public int countWays(int [] nums , int target , int dp[][], int n, int idx){

        if(idx==0){
            if(target==0 && nums[0]==0){
                return 2;
            }
        if(target==0 || target ==nums[0]){
            return 1;
        }
        return 0;
        }

        if(dp[idx][target]!=-1){
            return dp[idx][target];
        }

        int notTaken = countWays( nums , target,dp , n , idx-1);

        int Taken = Integer.MIN_VALUE;
        if(nums[idx]<= target){
            Taken = countWays(nums, target- nums[idx], dp, n, idx-1);

        }

        dp[idx][target] = Taken+ notTaken;
        return dp[idx][target];

    }
}
