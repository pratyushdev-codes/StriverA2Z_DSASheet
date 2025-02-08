public class BurstBalloon {
    public static void main(String[] args) {
        
    } public int maxCoins(int[] nums) {
        int n = nums.length;
        int arr []= new int [n+2];
        arr[0]=1; // filling the  front of the array 
        arr[n+1]=1;  //filling the last end because of the condition given
        for(int i = 0 ; i< n ;i++){
            arr[i+1] = nums[i];
        }
        int [][] dp = new int [n+2][n+2];
        for(int row []: dp){
            Arrays.fill(dp ,-1);
        }

        countBallons(arr, dp, 0, n-1);



    }public int countBallons(int [] arr, int dp[][] , int s , int e){



        if(s+1>=e) return 0;

        if(dp[s][e]!=-1){
            return dp[s][e];
        }
        int ans = Integer.MIN_VALUE;

        for(int index = s+1; index<e ; index++){
            int leftAns = countBallons(arr, dp , s, index, dp);
            int rightAns = countBallons(arr , dp , index , e, dp);
            int myAns = leftAns+ rightAns + arr[s]*arr[index]*arr[e];
            ans = Math.max(myAns, ans);
    
        }
        return dp[s][e]= ans;
    }
}
