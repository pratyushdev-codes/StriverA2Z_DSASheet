public class MinimumSidewaysJump {
    
return countMinLaneChanges(obstacle, 0 ,2, dp);
}
private int countMinLaneChanges(int[] obstacles, int currPos, int currLane, int[][] dp) {
        int n = obstacles.length - 1;

        // Base Case: If the frog reaches the last position, no more jumps are needed
        if (currPos == n) return 0;

        // If already computed, return the stored result
        if (dp[currPos][currLane] != -1) return dp[currPos][currLane];

        // Case 1: Move forward if no obstacle in the next position in the same lane
        if (obstacles[currPos + 1] != currLane) {
            return dp[currPos][currLane] = countMinLaneChanges(obstacles, currPos + 1, currLane, dp);
        }

        // Case 2: Sideways jump required
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= 3; i++) {
            // Find a different lane to jump to
            if (i != currLane && obstacles[currPos] != i) {
                ans = Math.min(ans, 1 + countMinLaneChanges(obstacles, currPos, i, dp));
            }
        }

        return dp[currPos][currLane] = ans; // Store and return the minimum jumps needed
    }
}


// bottom Up Approch :- 

public minChanges(int [] obstacles){
    int dp [][] = new int [obstacles.length][3];
    for(int row [] :dp){
        Arrays.fill( row, -1);
    }

    if(dp[currPos][currLane]!=-1){
        return dp[currPos][currLane];
    }

    for(int i=)
}