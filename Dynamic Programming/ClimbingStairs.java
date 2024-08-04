public class ClimbingStairs {
    public static void main(String[] args) {
        
    }public int  climbStaris(int n){
        int dp [] = new int [n];
        Arrays.fill(dp , -1 );

    }public int Solve(int n , int dp []){
        if(n == 1 || n==2){
            return n;
        }
        if(dp[i]!=0){
            return dp[n];
        }
        int x = Solve(n-1 , dp);
        int y = Solve(n-2, dp);
        dp[n] = x+y;
        return dp[n];
    }
}
