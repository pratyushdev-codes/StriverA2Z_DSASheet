// public class LongestincreasingSubsequence {
//     public static void main(String[] args) {
        
//     }public int lonngestincSquence(int [] nums ){
//         int n = nums.length;
//         int[] dp = new int[n];
//         Arrays.fill(dp , - 1 );
//         int ans= 0;
//         for(int i =0 ; i< n ; i++){
//             iny  lo = 0 ; int hi = ans;
//             while(lo<hi){
//                 int m = lo + (hi-lo)/2;
//                 if(dp[m]< nums[hi]){
//                   m = lo+1;
//                 }
//                 hi = m ;
//             }
//         }    

//         dp[lo]= nums[i];
//         if(lo==ans) ans++;
//         return ans;
  


//     }
// }


// DP Solution :- 

// public class LongestincreasingSubsequence {

//     public static void main(String[] args) {
//      public int lengthOfLIS(int[] nums) {



     
//     }public int countLIS(int [] nums,int idx, int prev_idx, int [][]dp){
//         if(idx==nums.length){
//             return 0;
//         }

//         if(dp[idx][prev_idx+1]!=-1){
//             return dp[idx][prev_idx];
//         }

//         int len = countLIS( nums , idx+1, prev_idx, dp);

//         if(prev_idx==-1 || prev_idx< nums[idx]){
//             len = Math.max(len , 1+ countLIS(nums, idx+1, idx, dp));
//         }

//         dp[idx][prev_idx + 1] = len;

//         return len;
//     }
// }


public class LongestincreasingSubsequence {

    public static void main(String[] args) {
        
    }   public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[][]= new int [n][n];
        for(int row []: dp){
            Arrays.fill(row, -1);
        }

    





    }public int Solve(int [] nums , int idx ,int prev_idx , int [][] dp){
        if(dp[idx][prev_idx+1]!=-1){
            return dp[idx][prev_idx+1];
        }

        if(idx==nums.length){
            return 0;
        }

        int len = Solve(nums , idx+1 , prev_idx, dp);


        // int Taken= Integer.MIN_VALUE;


        if(prev_idx<nums[idx] || prev_idx==-1){
            len =Math.max(len , 1+ Solve(nums , idx+1 , 0 , dp)) ;


        }
        dp[idx][prev_idx+1]=len;
        return len;
    }
}