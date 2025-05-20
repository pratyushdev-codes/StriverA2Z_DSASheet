public class LongestCommonSubstringbottomUp {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "zcdemf";
        
        System.out.println("Longest Common Substring Length: " + longestCommonSubstring(s1, s2));

    }
    
    public static int longestCommonSubstring(String s1, String s2){
        int [][] dp = new int [s1.length()+1][s2.length()+1];
        int maxLenght =0;

        for(int i =0 ; i<s1.length(); i++){
            for(int j =0 ; j<s2.length(); j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    int count = 1+ dp[i-1][j-1];
                    dp[i][j] = count;
                    maxLenght = Math.max(maxLenght, count);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return maxLenght;
    }
       
    }

