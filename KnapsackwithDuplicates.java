public class KnapsackwithDuplicates {
    public static void main(String[] args) {
        
    }public static int knapSack(int val[], int wt[], int capacity) {
        // trying the pick - un pick problem

        int dp[]= new int [wt.length];
        Arrays.fill(dp, -1);
        int n = wt.length;

        return knapsackHelper(val , wt, capacity , dp , n-1);


    }public static int knapsackHelper(int val [], int wt[], int capacity, int dp[][], int idx){
                if(idx=0){
                    return (capacity/wt[0])*val[0];
                }

              


        int Taken = 0;
        if(wt[idx]<=capacity){
            Taken = val[idx]+ knapsackHelper(val , wt, capacity-wt[idx] , dp, idx);
        }


        int notTaken = knapsackHelper(val , wt, capacity , dp , idx-1);


        return Math.max(Taken , notTaken);
    }
}
