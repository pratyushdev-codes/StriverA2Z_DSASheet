public class partionArrayforMax {
    public static void main(String[] args) {
        
    }    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp [] = new int[arr.length+1];
        Arrays.fill(dp , -1);






    } private int Solve(int[] arr, int k, int i, int[] dp, int n) {

        if(i==n){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }
        int curr_max = Integer.MAX_VALUE;
        int res = 0 ;

        for(int j =0 ; j<n && j-i+1<=k ; j++){
            curr_max= Math.max(curr_max, arr[j]);

            res= Math.max(res, (j-i+1)*curr_max)+ Solve(arr, k , j+1 , dp , n);


        }

        dp[i] = res;
        return dp[i];






    }
}
