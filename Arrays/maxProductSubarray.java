import com.apple.laf.resources.aqua;

public class maxProductSubarray {
    public static void main(String[] args) {
        
    }public int maxProduct(int[] nums) {
        int n = nums.length;

        int pre = 1;
        int suff =1;

        int ans = Integer.MIN_VALUE;

        for(int i =0;i<n;i++){
            pre= pre * nums[i];
            suff= suff*nums[n-i-1];

            ans = Math.max(ans, Math.max(pre, suff));
            if(pre==0) pre=1;
            if(suff==0) suff=1;
            
           
        }
        return ans ;
    }
}

