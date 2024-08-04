public class UniquePaths {
    public static void main(String[] args) {
        
    }public int uniquePaths(int m ,int n ){
        int[][] dp = new int[m][n];
        for(int [] rows : dp){
            Arrays.fill(rows, -1);
        }


    }public int Solve(int m ,int i , int n ,int j , int dp [][]){
         if(i==-m-1 || j==n-1){
            return 1;
         }
         if(i<0 || i>=m || j<0 || j>=n) return 0 ;
        
         if(dp[i][j]!=-1)return 0;

         int sidewards = Solve(m , i+1 , n , j , dp);
         int downwards = Solve(m, i , n, j+1 , dp);

         dp[i][j] = sidewards+ downwards;
         return dp[i][j];
    }
}
 