// public class minimumCosttocutStick {
//     public static void main(String[] args) {
        
//     }public int minCost(int n , int [] nums){
//         ArraysList<Integer> ls = new ArrayyList<>();
//         ls.add(0);
//         for(int i : nums){
//             ls.add(i);
//         }
//         ls.add(n);

//         Arrays.sort(nums);

//         int dp[][] = new int [ls.size()][ls.size()];


//         // int l ,r  // boundaries to segment it from l to r
//     }public int Solve(ArrayList<Integer> ls , int l , int r , int dp[][]){
//         if(r-l<2){  //no enough cuts
//             return 0;

//         }

//         if(dp[l][r]!=-1){
//             return dp[l][r];
//         }
//         int result = Integer.MIN_VALUE;

//         for(int index = l+1 ;index<=r-1; index++ ){
//             int cost = ls.get(r)-ls.get(l) + Solve(ls , l , r , dp);

//             result= Math.min(result , cost);
//         }

//         dp[l][r] = result;
//         return result;



//     }
// }

import java.util.ArrayList;

public class minimumCosttocutStick {

    public static void main(String[] args) {
        
    }public int minCost(int n , int [] nums){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        for(int i : nums){
            list.add(i);

        }
        list.add(n);


        return Solve(list, 0, list.size()-1, dp);


    }public int Solve(ArrayList<Integer> list , int l , int r, int dp[][]){
        if(r-l<2){
            return 0;
        }

        if(dp[l][r]!=-1){
            return dp[l][r];
        }

        int result = Integer.MIN_VALUE;

        for(int index= l+1 ; index<=r-1; index++){
            int cost =list.get(r)-list.get(l)+ Solve(list, l ,r , dp);
            result = Math.min(cost ,result);
        }

        dp[l][r] = result;
        return result;
    }


}