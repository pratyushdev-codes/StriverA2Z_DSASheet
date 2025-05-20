/**
 * maxSubsequenceSum
 */
import java.util.Arrays;
public class maxSubsequenceSum {

    public static void main(String[] args) {
        
    }public static int findMaxSum(int arr []){
        //parent fn for findMax
        int n = arr.length;
        int dp[]= new int [n];
        Arrays.fill(dp,-1);
       

    }public int solve(int [] arr , int i , int dp []){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return 0;
        }
        int x = solve(arr , i -1, dp); // exclude  
        int y = solve(arr , i -1 , dp) + arr [i]; //excluding
        dp[i]= Math.max(x,y);
        return dp[i];

    }
}