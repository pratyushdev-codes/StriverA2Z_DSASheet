public class checkPalindrome {
    public static void main(String[] args) {
        
    } public int minCut(String s) {



    }public boolean checkPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                return true;
            }
            i++;
            j--;
        }
return false;
    }public int helperFun(String s , int i , int dp[], int n){
        if(i==n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int ans = 0;

        for(int idx = i ; idx<n ; i++){
            if(checkPalindrome(s)==true){
               int cost = 1+ helperFun(s, i+1, dp ,n);
                ans = Math.max(cost, ans);

            }
        }
        return dp[i]= ans;
        
    }
}
