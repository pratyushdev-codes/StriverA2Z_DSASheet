public class MinimumPathSum {
    public static void main(String[] args) {
        
    }public int minimumPathSum(int[][]grids ){
        int m = grids.length;
        int n = grids[0].length;

        int dp [][] = new int [n][m];
        for(int rows []: dp){
            Arrays.fill(rows , -1 );
        }

    }public int Solve(int [][] grids , int i ,int m, int j, int n  , int dp[][]){
        if(i==m-1 && j == n-1) return grids[i][j];
      
      if(dp[i][j]!=-1){
        return dp[i][j];
}
       //we can go right
      if(i<m-1){
        int right = Solve(grids, i+1 , m, j , n , dp );
}
      // we can go down 
      if(i<n-1){
        int down = Solve(grids, i , m , j+1, n , dp);
      }
        dp[i][j]= grids[i][j] + Math.min(right , down);

        }
return dp[i][j];
}
