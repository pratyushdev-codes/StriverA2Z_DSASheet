import java.util.*;

public class GridUniquePaths {
    public static void main(String[] args) {
     
    }    public int uniquePaths(int m, int n) {
        int dp[][] = new int [m][n];
        for(int row[] :dp){
            Arrays.fill(row,-1);
        }


        return countUniquePath(m, n, m, n, dp);




    }public int countUniquePath(int m, int n, int i , int j , int dp[][]){
        if(i==m-1 && j==1 ){
            return 1;

        }

        if(i>=m || j>=n){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int xWays= countUniquePath(m , n , i+1 , j , dp);
        int yWays= countUniquePath(m , n , i , j+1 , dp);

        return dp[i][j]= xWays+yWays;
    }
}
