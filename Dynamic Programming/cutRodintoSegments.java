public class cutRodintoSegments {
    public static void main(String[] args) {
        
    }public static int countRodCuts(int n, int X, int Y , int Z){

        if(n==0){
            return 0;
        }

        if(n<0){
            return Integer.MIN_VALUE;
        }
        int dp [ ] = new int [n+1];

        int pickX = 1+ countRodCuts(n-X, X, Y , Z);
        int pickY = 1+ countRodCuts(n-Y, X, Y , Z);
        int pickZ = 1+ countRodCuts(n-Z, X, Y , Z);


        return dp[n]= Math.max(pickX, Math.max(pickY, pickZ));
    }
}


// Bottom Up Approach :-
public static int countRodCuts(int n, int X, int Y , int Z){
    int dp [] = new int [n+1];
    Arrays.fill(dp , -1);

    if(n==0){
        return 0;
    }

    if(dp[n]!=-1){
        return dp[n];
    }

    if(n<0){
        return Integer.MIN_VALUE;
    }

    dp[0] = 0;

    for(int i = 1 ; i <= n ; i++){

        if(i-X>0 && dp[i-X]!=-1){
            dp[i] = Math.max(dp[i], dp[i-X]+1);
        }

        if(i-Y>0 && dp[i-Y]!=-1){
            dp[i] = Math.max(dp[i], dp [i-Y]+1);
        }

        if(i-Z>0 && dp[i-Z]!=-1 ){
            dp[i]= Math.max(dp[i], dp[i-Z]+1);
        }
    if(dp[n]<0){
        return dp[n];
    }
    }




}
