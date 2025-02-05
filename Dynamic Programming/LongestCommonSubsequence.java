// import java.util.*;
// public class LongestCommonSubsequence {
//     public static void main(String[] args) {
        
//     }import java.util.Arrays;

//     public class LongestCommonSubsequence {
//         public static void main(String[] args) {
//             LongestCommonSubsequence lcs = new LongestCommonSubsequence();
//             String text1 = "abcde";
//             String text2 = "ace";
//             System.out.println("Length of Longest Common Subsequence: " + lcs.longestCommonSub(text1, text2));
//         }
    
//         public int longestCommonSub(String text1, String text2) {
//             int m = text1.length();
//             int n = text2.length();
//             int[][] dp = new int[m][n];
    
//             for (int[] row : dp) {
//                 Arrays.fill(row, -1);
//             }
    
//             return LCS(text1, m - 1, text2, n - 1, dp);
//         }
    
//         public int LCS(String text1, int i, String text2, int j, int[][] dp) {
//             if (i < 0 || j < 0) {
//                 return 0;
//             }
    
//             if (dp[i][j] != -1) {
//                 return dp[i][j];
//             }
    
//             if (text1.charAt(i) == text2.charAt(j)) {
//                 dp[i][j] = 1 + LCS(text1, i - 1, text2, j - 1, dp);
//             } else {
//                 int x = LCS(text1, i - 1, text2, j, dp);
//                 int y = LCS(text1, i, text2, j - 1, dp);
//                 dp[i][j] = Math.max(x, y);
//             }
    
//             return dp[i][j];
//         }
//     }
    
public class LongestCommonSubsequence {

    public static void main(String[] args) {
        
    }  public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int [][] dp = new int [n][m];
        for(int row[]: dp){
            Arrays.fill(dp , -1);
        }






    }public static countLCS(String s1, String s2, int i , int j , int dp[][]){
            // BASE CASE:-



            
    }
}