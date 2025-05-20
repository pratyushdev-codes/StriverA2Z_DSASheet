// public class MinimumPathSum {
//     public static void main(String[] args) {
        
//     }public int minimumPathSum(int[][]grids ){
//         int m = grids.length;
//         int n = grids[0].length;

//         int dp [][] = new int [n][m];
//         for(int rows []: dp){
//             Arrays.fill(rows , -1 );
//         }

//     }public int Solve(int [][] grids , int i ,int m, int j, int n  , int dp[][]){
//         if(i==m-1 && j == n-1) return grids[i][j];
      
//       if(dp[i][j]!=-1){
//         return dp[i][j];
// }
//        //we can go right
//       if(i<m-1){
//         int right = Solve(grids, i+1 , m, j , n , dp );
// }
//       // we can go down 
//       if(i<n-1){
//         int down = Solve(grids, i , m , j+1, n , dp);
//       }
//         dp[i][j]= grids[i][j] + Math.min(right , down);

//         }
// return dp[i][j];
// }



public class MinimumPathSum {

  public static void main(String[] args) {
    
  } public int minPathSum(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int dp[][] = new int[m][n]; 
    for(int row []: dp){
      Arrays.fill(dp ,-1);
    }


    return countminSum(0, 0, dp, m, n, grid);



  }public int countminSum(int i , int j ,int dp [][] ,  int m, int n, int [][] grid){
    if(i==m-1 && j==n-1){
       grid[i][j];
    }

    if(dp[i][j]!=-1){
      return dp[i][j];
    }


    int right=Integer.MAX_VALUE;
    int down= Integer.MIN_VALUE;

    if(i<m-1){
      right= countminSum(i+1 , j , dp , m , n , grid);
      
    }

    if(j<n-1){
      down = countminSum(i, j+1, dp, m, down, grid);
    }

    return dp[i][j]= grid[i][j]+ Math.min(right, down);
  }
}