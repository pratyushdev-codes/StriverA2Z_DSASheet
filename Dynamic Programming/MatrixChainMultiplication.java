public class MatrixChainMultiplication {
    public static void main(String[] args) {
        
    } public  static int matrixMultiplication(int arr[]) {
            int n = arr.length;
        int dp[][] = new int [n][n];

        return countways(arr, 1, n-1, dp);
    }public static int countways(int arr [], int i,int j, int dp[][]){
        int n = arr.length;
        if(i==j){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int min = Integer.MIN_VALUE;

        for(int k= i ; k<j ; k++){
            int cost = countways(arr, i, k , dp) + countways(arr, k+1, j , dp) + arr[i-1]*arr[k]*arr[j];
            min= Math.min(min , cost);
        }
            return dp[i][j]=min;
    }
}
