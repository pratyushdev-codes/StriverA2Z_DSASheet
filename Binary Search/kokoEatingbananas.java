class kokoEatingbananas {
   public double calculateHours(int  piles[], int h ) {
             double totalHours =0;
           for(int i =0;i<piles.length;i++){
             totalHours+= Math.ceil((double)(piles[i]) / (double)(h));
           }
           return totalHours;
    }public static int findMax(int [] piles){
        int max= Integer.MIN_VALUE;
        for(int i =0; i<piles.length;i++){
             max = Math.max(piles[i], max);
        }
        return max;
    }
   public int minEatingSpeed(int[] piles, int h) {
    int low = 1; // Speed cannot be zero, so start from 1
    int high = findMax(piles);

    while (low <= high) {
        int mid = low + (high - low) / 2;
        double totalH = calculateHours(piles, mid);

        if (totalH <= h) {
            // If total hours taken is less than or equal to h,
            // decrease the high boundary
            high = mid - 1;
        } else {
            // If total hours taken is more than h, increase the low boundary
            low = mid + 1;
        }
    }
    // Once low > high, low will be the minimum eating speed satisfying the condition
    return low;
}


}
