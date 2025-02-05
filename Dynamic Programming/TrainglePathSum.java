import java.util.Arrays;
import java.util.List;

public class TrainglePathSum {
    public static void main(String[] args) {
        
    }    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp [][]= new int[n+1][n+1];
        for(int [] row: dp){
            Arrays.fill(row, -1);
        }




    }public int findminPathSumtriangle(int i ,int j ,int dp[][], List<List<Integer>> triangle, int n ){
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(i==n-1){
            return triangle.get(i).get(j);
        }

        int downWays= findminPathSumtriangle(i+1, j , dp , triangle , n );
        int diagonolWays= findminPathSumtriangle(i+1, j+1, dp , triangle , n);  

        return dp[i][j]= triangle.get(i).get(j)+ Math.min(downWays, diagonolWays);

    }
}
