// public class NinjaTraining {
//     public static void main(String[] args) {
        
//     }    public int maximumPoints(int arr[][]) {
//         int n = arr.length;
//         int m= arr[0].length;


//         int dp[][] = new int[n][3]; 

//         for(int i = 0 ; i< n ;i++ ){

//                 dp[0][i]=arr[0][i];
//             }
    
            


//         dp[0][0]=arr[0][0];



//         for(int i = 0 ; i< n ;i++ ){
//             for(int j = 0 ; j<3; j++){
//                 dp[i][j] = arr[i][j] + Math.max(
//                     (j != 0 ? dp[i-1][0] : 0), 
//                     Math.max((j != 1 ? dp[i-1][1] : 0), 
//                              (j != 2 ? dp[i-1][2] : 0)));
//             }
//         }

//         return Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));

//     }
// }
import java.util.Arrays;

public class NinjaTraining {

    public static void main(String[] args) {
        int[][] points = {
            {10, 40, 70},
            {20, 50, 80},
            {30, 60, 90}
        };
        int n = points.length;

        System.out.println(maximumPoint(points)); // Expected Output: 210
    }

    public static int maximumPoint(int[][] arr) {
        int n = arr.length;
        // dp[n][4] because "last" can take values 0,1,2,3 (3 = no restriction)
        int[][] dp = new int[n][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return findMax(n - 1, 3, arr, dp);
    }

    public static int findMax(int day, int last, int[][] points, int[][] dp) {
        // Base case: Day 0
        if (day == 0) {
            int maxi = 0;
            for (int task = 0; task < 3; task++) {
                if (task != last) {
                    maxi = Math.max(maxi, points[0][task]);
                }
            }
            return dp[0][last] = maxi;
        }

        // If already computed
        if (dp[day][last] != -1) {
            return dp[day][last];
        }

        int maxi = 0;
        for (int task = 0; task < 3; task++) {
            if (task != last) {
                int activity = points[day][task] + findMax(day - 1, task, points, dp);
                maxi = Math.max(maxi, activity);
            }
        }

        return dp[day][last] = maxi;
    }
}
