// import java.util.Arrays;

// public class CoinChange {
//     public static void main(String[] args) {
//         //Main Function
//     }public int coinChange(int [] coins , int amount){
//         int n = coins.length;
//         int dp[][] = new int[n][amount+1];
//         for(int row[]:dp){
//             Arrays.fill(dp,-1);
//         }
//         int result = pick(coins , amount , n-1 , dp);
//         return result>=(int)Math.pow(10, 9 )?-1 : result;
        

//     }public int pick (int []coins , int amount , int idx , int dp[][]){
//            if(idx==0){
//             if(amount%coins[0]==0){
//                 return amount/coins[0];
//            }else{
//             return (int)Math.pow(10,9);
//            }
//     }if(dp[idx][amount]!=-1){
//         return dp[idx][amount];
//     }
//     int notTaken =pick(coins , amount , idx-1 , dp);

//     //taking the current coin:
//     if(coins[idx]<=amount){
//         int taken = pick(coins , amount-coins[idx], idx-1 , dp);

//         dp[idx][amount] = Math.min(notTaken , taken);

//     }        return dp[idx][amount];
// }
// }
import java.util.*;
public class CoinChange {
    public int MOD= (int)Math.pow(10, 9);

    public static void main(String[] args) {
        
    }    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp [][] = new int [n+1][n+1];
        for(int row [] : dp){
            Arrays.fill(row , -1);

        }

        return (coinChangeHelper(coins, amount, dp , n-1)%MOD);






    }public int coinChangeHelper(int [] coins , int amount , int dp [][] , int idx){
        if(dp[idx][amount]!=-1){
            return dp[idx][amount];
        }



        if(idx==0){
            if(amount%coins[0]==0){
                return amount/coins[0];
            }else{
                return (int)MOD;
            }
        }
        int taken= Integer.MAX_VALUE;

        if(coins[idx]<=amount){
            taken = 1+ coinChangeHelper(coins, amount-coins[idx], dp, idx-1);
        }

        int notTaken = coinChangeHelper(coins , amount, dp , idx-1);

        return dp[idx][amount]= Math.min(taken, notTaken);



    }
}