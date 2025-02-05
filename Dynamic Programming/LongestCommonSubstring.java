
import java.util.Arrays;

public class LongestCommonSubstring {
    private static int[][] dp;
    
    public static int findLCS(String s1, String s2, int i, int j, int count) {
        if (i == 0 || j == 0) {
            return count;
        }
        
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int maxLength = count;
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            maxLength = findLCS(s1, s2, i - 1, j - 1, count + 1);
        }

        maxLength = Math.max(maxLength, Math.max(findLCS(s1, s2, i - 1, j, 0), findLCS(s1, s2, i, j - 1, 0)));

        dp[i][j] = maxLength;
        return maxLength;
    }

    public static int longestCommonSubstring(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        dp = new int[m + 1][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return findLCS(s1, s2, m, n, 0);
    }

    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "zcdemf";

        System.out.println("Longest Common Substring Length: " + longestCommonSubstring(s1, s2));
    }
}
