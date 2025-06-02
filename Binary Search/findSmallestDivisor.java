public class findSmallestDivisor {
    public static void main(String[] args) {
        int nums [] = { 1,2,5,9};
        int threshold = 6;

    }public int calculate(int nums [], int threshold){
        int sum =0;
        for(int i = 0 ; i< nums.length ; i++){
            sum += (Math.ceil((double)(nums[i])/threshold));
        }
        return sum;
    }public int findSmallestDivisor(int []nums , int threshold){
        int n = nums.length; //size of array.
        if(n > threshold) return -1;
        //Find the maximum element:
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        int low = 1;
        int high = maxi;
        while (low < high) {
            int mid = low + high/2;

            if(calculate(nums, threshold)<= mid){
// continue with the binary Search 
            }

        }

    }
}
