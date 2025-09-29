public class submatriceswithAllones {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1},
            {1, 1, 0},
            {1, 1, 0}
        };
      int dp[][] = new int [matrix.length+1][matrix[0].length+1];
      int ans =0;
      for(int i =0 ;i< matrix.length ; i++){
        dp[i][0]= matrix[i][0];
      }

      for(int j =0 ; j< matrix[0].length ; j++){
        dp[0][j]= matrix[0][j];
      }

      for(int i =0 ; i< matrix.length ; i++){
        for(int j =0 ; j< matrix[0].length ;j++){
            if(matrix[i][j]==1){
                dp[i][j] = Math.min(Math.min(dp[i-1][j],Math.min( dp[i][j-1], dp[i-1][j-1])))+1;
            }else{
                dp[i][j]=0;
            }

        }
      }
      int sum =0;
      for(int i =0 ; i< matrix.length ; i++){
        for(int j =0 ; j< matrix[0].length ;j++){
            sum+= dp[i][j];
        }
      }
    }


    
}
