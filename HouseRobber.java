public class HouseRobber {
    public static void main(String[] args) {
        
    }public int houseRobber(int arr [] ){

    }public int Solve(int arr []  , int i ,int n , int dp []){
        if(i>=n){
            return 0 ;
        }

        if(dp[i]!=0){
            return dp[i];
        }

        //Steal Current House :-
        int Steal =arr [i]+ Solve(arr, i+2 , n, dp);
        //Not Steal Current House :- Skip
        int Skip = Solve(arr, i+1, n, dp);
       

        dp[i]= Math.max(Skip, Steal);


    }
}
