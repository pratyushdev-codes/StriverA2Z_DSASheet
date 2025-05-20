
// You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

// Return the number of combinations that make up that amount. If that amount of money cannot be made up by any combination of the coins, return 0.

// You may assume that you have an infinite number of each kind of coin.

// The answer is guaranteed to fit into a signed 32-bit integer.
import java.util.*;

public class coinChange2 {
    public static void main(String[] args) {
        
    }    public int change(int amount, int[] coins) {
        // no of possible ways to make the amount 

        int n = coins.length;
        int dp[][]= new int [n+1][n+1];
        for(int row []: dp){
            Arrays.fill(row, -1);
        }


    }public int countWaysTomakeAmount(int coins[], int amount , int idx ,int [][] dp){
        if(amount==0){
            return 1;
        }
        if(idx<0){
            return 0;
        }
       if(dp[idx][amount]!=-1){
        return dp[idx][amount];
       }

       int taken =0 ;
       if(coins[idx]<=amount){
        taken = countWaysTomakeAmount(coins , amount - coins[idx], idx-1 , dp);
       }

       int notTake = countWaysTomakeAmount(coins , amount , idx-1, dp);
       dp[amount][idx]= notTake+ taken;

       return dp[amount][idx];
    }
    
}


