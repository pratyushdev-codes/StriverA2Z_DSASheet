public class HouseRobberII {
    class Solution {
        public int rob(int[] nums) {
            int n = nums.length;
            int[] dp = new int[n]; 
            Arrays.fill(dp, -1);   
    
            if (n == 1) {
                return nums[0];
            }
    
            if (n == 2) {
                return Math.max(nums[0], nums[1]);
            }
    
            int take0thIndexHouse = Solve(nums, 0, n - 2, dp); 
            Arrays.fill(dp, -1); 
            int take1stIndexHouse = Solve(nums, 1, n - 1, dp);
    
            return Math.max(take0thIndexHouse, take1stIndexHouse);
        }
    
        // Reusing this Solve function used in House Robber - I   
        public int Solve(int[] nums, int i, int n, int[] dp) {
            if (i > n) {
                return 0;
            }
    
            if (dp[i] != -1) {
                return dp[i];
            }
    
            // rob
            int steal = nums[i] + Solve(nums, i + 2, n, dp);
            // skip --> don't rob
            int skip = Solve(nums, i + 1, n, dp);
    
            dp[i] = Math.max(steal, skip);
            return dp[i];
        }
    }
}    