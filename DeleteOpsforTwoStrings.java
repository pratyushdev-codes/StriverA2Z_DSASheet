import java.util.Arrays;

public class DeleteOpsforTwoStrings {
    
    public static void main(String[] args) {
        
    }

 public int minDistance(String word1, String word2) {
      int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int lcsLenght = LCS(word1, n-1 , word2, m-1 , dp);
        return n+m-(2*lcsLenght);

        // To transform word1 into word2, we need to remove characters from word1 that are not part of the LCS.
        // n−lcsLength

        // Similarly, we need to remove characters from word2 that are not part of the LCS.
        // m−lcsLength

        // (n−lcsLength)+(m−lcsLength)=n+m−2×lcsLength

} public int LCS(String s1, int i, String s2, int j, int[][] dp) {
    if (i == 0 || j == 0) {
        return 0;
    }

    if (dp[i][j] != -1) {
        return dp[i][j];
    }

    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
        dp[i][j] = 1 + LCS(s1, i - 1, s2, j - 1, dp);
    } else {
        dp[i][j] = Math.max(LCS(s1, i - 1, s2, j, dp), LCS(s1, i, s2, j - 1, dp));
    }

    return dp[i][j];
}
}

