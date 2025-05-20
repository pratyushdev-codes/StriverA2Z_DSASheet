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


// Bottom Up appraoch := 

public class int countMaxWays(int n){
    if(n==0){
        return cost[0];
    }
    if(n==1){
        return cost[1];
    }

    for(int i = 2; i<= n ; i++){
        dp[i] = cost [i]+ Math.max(dp[i-1], dp[i-2]);
    }

    return Math.min(dp[n-1], dp[n-2]);
}
