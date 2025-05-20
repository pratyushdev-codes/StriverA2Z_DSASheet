public class NinjaTraining {
    public static void main(String[] args) {
        
    }    public int maximumPoints(int arr[][]) {
        int n = arr.length;
        int m= arr[0].length;


        int dp[][] = new int[n][3]; 

        for(int i = 0 ; i< n ;i++ ){

                dp[0][i]=arr[0][i];
            }
    
            


        dp[0][0]=arr[0][0];



        for(int i = 0 ; i< n ;i++ ){
            for(int j = 0 ; j<3; j++){
                dp[i][j] = arr[i][j] + Math.max(
                    (j != 0 ? dp[i-1][0] : 0), 
                    Math.max((j != 1 ? dp[i-1][1] : 0), 
                             (j != 2 ? dp[i-1][2] : 0)));
            }
        }

        return Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));

    }
}
