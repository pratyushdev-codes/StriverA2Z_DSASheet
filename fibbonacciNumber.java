public class fibbonacciNumber {
    public static void main(String[] args) {
        
    }public int fibbonacciNumber(int n ){
        if(n ==0 || n==1){
            return n ;
        }

        if(dp[n]!=-1){
            return dp[n];
        }
        int a = fibbonacciNumber(n-1);
        int b = fibbonacciNumber(n-1);

       return  dp[n]= a+b;
        
    }
}


// bottom up approach :- 

public int fibboNacci(int n ){
    if(n==1 ){
        return 1;
    }

    if(n==0){
        return 0;
    }

    for(int i =2 ; i<= n ; i++){
        dp[i]= dp[i-1]+dp[i-2];
    }
    return dp[n];
}