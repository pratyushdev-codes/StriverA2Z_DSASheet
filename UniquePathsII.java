import java.util.Arrays;

public class UniquePathsII {
    public static void main(String[] args) {
        
    }public int uniquePathswithObstacles(int [][] obstacleGrid){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int dp [] [] = new int dp[m][n];

        for(int row []:dp){
            Arrays.fill(row , -1);
        }
    }
}
