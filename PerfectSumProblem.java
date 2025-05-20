public class PerfectSumProblem {
    public static void main(String[] args) {
        
    }    public int perfectSum(int[] nums, int target) {
        int n = nums.length;
        int dp[][] = new int [n+1][n+1];
        for(int row [] : dp){
            Arrays.fill(row , -1);
        }

        return countSums(nums, target, n-1, dp, n);

        

    }public int countSums(int [] nums , int target , int idx, int dp[][] , int n){
        if(dp[idx][target]!=-1){
            return dp[idx][target];
        }

        if(target==0){
            return 1;

        }

        if(idx==0){
            return nums[0]==target? 1:0;
        }



        int taken = Integer.MIN_VALUE;

        if(nums[idx]<=target){
            taken= 1+countSums(nums , target-nums[idx], idx-1 , dp , n);
        }

        int notTaken =countSums(nums , target, idx-1 , dp , n);

       dp[idx][target]= taken+ notTaken;
       return dp[idx][target];


    }

}
