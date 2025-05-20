public class FrogJump {
    public static void main(String[] args) {
        
    } int minCost(int[] height) {

        int n= height.length;
        int dp[] = new int [n];
        Arrays.fill(dp,-1);
        // dp[0]=0;

//         for(int i =1; i<n ;i++){
//           dp[i]=Math.min(dp[i-1]+Math.abs(height[i]-height[i-1]),i>=2?dp[i-2]+Math.abs(height[i]-height[i-2]):Integer.MAX_VALUE);
//         }

// return dp[n-1];

return Solve(height,dp,n-1,n-1);

  }public int Solve(int [] height , int dp[] ,int i, int n  ){
    if(i==0){
        return 0;

    }

    if(dp[i]!=-1){
        return dp[i];
    }

    if(i>n){
        return 0;
    }
    int step1= Math.abs(height[i]-height[i-1])+Solve(height,dp,i-1,n);
    int step2= Math.abs(height[i]-height[i-2])+Solve(height,dp,i-2,n);

    int ans = Integer.MAX_VALUE;
    ans= Math.abs(ans,Math.min(step1,step2));
    return ans;

  }


}
