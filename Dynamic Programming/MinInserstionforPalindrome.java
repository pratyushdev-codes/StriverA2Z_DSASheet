public class MinInserstionforPalindrome {
    public static void main(String[] args) {

        
    }    public int minInsertions(String s) {
        //main dp 
        int n = s.length();

        int dp [][]= new int [n+1][n+1];
        for(int row [] : dp){
            Arrays.fill(dp , -1);
        }

        return countOps(s, 0 ,n-1, dp);





    }public int countOps(String s, int i , int j , int dp[][]){
        if(i>j){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]= countOps( s, i+1 , j-1, dp);
        }else{
            dp[i][j]=1+ Math.min(countOps(s, i+1 , j , dp), countOps(s, i , j-1, dp));
        }
        return dp[i][j];

    }
}
