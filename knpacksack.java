public class knpacksack {
    public static void main(String[] args) {
    
    }public class knapsack(int []nums){

    
       
            
        }public int Solve(int w [], int v[], int k, int i ,int [] [] dp ){
           if(dp[i][k]!=-1){
            return dp[i][k];
           }   
           if(i<=0){
            return 0;
           }         
           int x = Solve(w, v, k , i-1 , dp);
           int y =0;
           if(k>=w[i]){
            y= Solve(w, v, k-w[i], i-1)+ v[i];
           }
           dp[i][k]= Math.max(x,y);
           return dp[i][k];
        }
    }
