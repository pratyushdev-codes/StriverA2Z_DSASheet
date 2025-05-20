public class GridUniquePaths2 {
    public static void main(String[] args) {
    
}    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;

    int dp [][]= new int [m][n];
    for(int row[]: dp){
        Arrays.fill(row, -1);
    }






}public int SolvePaths(int m , int n , int dp[][],int [][] obstacleGrid){

    if(dp[m][n]!=-1){
        return dp[m][n];
    }

    if(n<0|| m<0){
        return 0;
    }

    if(n>=0 && m>=0 && obstacleGrid[m][n]==1){
        
    return 0;
    }

    if(m==0 && n==0){
        return 1;
    }

    int xWays= SolvePaths(m-1, n , dp , obstacleGrid);
    int yWays= SolvePaths(m , n-1 , dp , obstacleGrid);


    return dp[m][n]= xWays+yWays;


}
}



