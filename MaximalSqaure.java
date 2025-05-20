public class MaximalSqaure {
    public static void main(String[] args) {
        
    }public int maximalSquares(int matrix [][]){
        int m =matrix.length;
        int n = matrix[0].length;
        int dp [ ][] = new int[i+1][j+1];
        for(int i =0 ; i < m ; i++){
            int ans -0;
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][j]==0){
                    dp[i][j]==1;
                }else{
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1] , dp[i-1][j-1]))+1;
                    
                }
                ans = Math.max(ans , dp[i][j]);
            }
        }
        return ans*ans;
        
    }
}
