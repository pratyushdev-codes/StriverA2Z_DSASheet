
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




    }
}