public class knapsack01 {
    public static void main(String[] args) {
        
    }    public static int MaxValueKnapsack(int W[], int V[], int KnapsackW, int idx, int[][] dp) {
        if (idx == W.length) {
            return 0;
        }
        
        if (dp[idx][KnapsackW] != -1) {
            return dp[idx][KnapsackW];
        }

        // Exclude current item
        int exclude = MaxValueKnapsack(W, V, KnapsackW, idx + 1, dp);
        
        // Include current item if it fits
        int include = 0;
        if (W[idx] <= KnapsackW) {
            include = V[idx] + MaxValueKnapsack(W, V, KnapsackW - W[idx], idx + 1, dp);
        }

        return dp[idx][KnapsackW] = Math.max(include, exclude);
    }

    
}


// bottom up approach : -


public static int  topDownMaxValue(int W[] , int V [] , int knapsackW ){
    int dp [][] = new int [W.length+1][knapsackW+1];
    for(int iterator []: dp){
        Arrays.fill(iterator, -1);
    }
    //resolving base case:-=
    for(int w = W[0] ; w<=knapsackW ; w++){
        if(W[0]<=knapsackW){
            dp[0][w] = V[0];
        }else{
            dp[0][w]=0;
        }
    }
    for(int idx =1 ; idx<= n; idx++){
        for(int w = 0 ; w<=knapsackW ; w++){

            int include = 0;
          if(W[idx]>=knapsackW){
            dp[idx][W] = V[idx] + dp[idx-1][w-W[idx]]; 

            int exclude = 0+ dp[idx][idx-1];
            return dp[idx][w]= Math.max(include, exclude);
          }
        }
    }


    }
