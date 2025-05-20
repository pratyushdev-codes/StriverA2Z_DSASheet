
// // Minimum Operations to convert String s2 to s1.
// import java.util.*;
// public class editDistance {
//     public static void main(String[] args) {
        
//     }public int EditDistance(String s1, int i , String s2, int j , int [][] dp ){
//         if(i==-1 && j==-1) return 0;
//         if(i==-1 && j!=-1) return j+1; 
//         if(i!=-1 && j==-1)return i+1;

//         if(dp[i][j]!=-1){
//             return dp[i][j];
//         }
//         if(s1.charAt(i)==s2.charAt(j)){
//             int x = EditDistance(s1, i-1,s2, j-1 , dp );

//         }
//         //Adding 
//         int x= EditDistance(s1, i, s2, j-1, dp);
//         //Deleting
//         int y= EditDistance(s1, i-1, s2, j, dp);
//         //Repeating 
//         int z = EditDistance(s1, i, s2, j-1, dp);
//         dp[i][j] = Math.min(Math.min(x,y),z)+1;

//         return dp[i][j];

  
//     }
// }


public class editDistance {

    public static void main(String[] args) {
        
    }   public int minDistance(String word1, String word2) {

        return countWays(word1, word2, n-1, m-1 , dp);



    }public int countWays(String s1, String s2, int i , int j , int dp[][]){

        if(i==-1 && j==-1){
            return 0;
        
        }

        if(j==-1 && j!=-1){
            return j+1;
  
        }

        if(i!=-1 && j==-1){
            return i+1;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s1.charAt(i)==s2.charAt(j)){
            int x = countWays(s1, s2, i-1, j-1, dp);
            dp[i][j]=x;
            return dp[i][j];
        }else{
            int insertion = countWays( s1, s2, i , j-1 , dp );
            int deletion = countWays(s1, s2, i-1 , j, dp);
            int replacing = countWays(s1, s2, i-1, j-1, dp);

            dp[i][j] = Math.min(insertion , Math.min(replacing, deletion))+1;

            return dp[i][j];

        }
   

    }
}