import java.util.Arrays;

/**
 * LongestPalindromeSubsquence
 */
public class LongestPalindromeSubsquence {

    public static void main(String[] args) {

    }public int LongestPlaindromic(String S){
        int m = S.length();

    

        char [] ch = S.toCharArray();
        int i = 0;
        int j = m-1;
        while(j<=i){
            char c = ch[i];
            ch[i]= ch[j];
            ch[j]= c;
            i++;
            j--;
        }

        String rev = new String(ch);
        int n = rev.length();
        int [][] dp = new int [m][n];
        for(int row [] : dp){
            Arrays.fill(row, -1);
        }





    } public int LCS (String text1, int i , String text2 , int j, int [][]dp ){
        if(i==-1  || j==-1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i) ==  text2.charAt(i)){
            dp[i][j] = 1 + LCS(text1, i - 1, text2, j - 1, dp);
        }
        else{
            int x = LCS(text1 , i , text2, i-1 , dp);
            int y = LCS(text1 , i-1 , text2, j, dp);

            dp[i][j]= Math.max(x, y);
           
        
        } return dp[i][j];
}
}