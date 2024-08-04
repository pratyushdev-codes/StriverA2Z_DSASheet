public class LongestincreasingSubsequence {
    public static void main(String[] args) {
        
    }public int lonngestincSquence(int [] nums ){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp , - 1 );
        int ans= 0;
        for(int i =0 ; i< n ; i++){
            iny  lo = 0 ; int hi = ans;
            while(lo<hi){
                int m = lo + (hi-lo)/2;
                if(dp[m]< nums[hi]){
                  m = lo+1;
                }
                hi = m ;
            }
        }    

        dp[lo]= nums[i];
        if(lo==ans) ans++;
        return ans;
  


    }
}
