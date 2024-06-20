import java.util.HashMap;

public class CountNiceSubarray {
    public static void main(String[] args) {
        
    } public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int prefixSum = 0;
        int niceSubarraysCount=0;

        hm.put(0,1);
        for(int num:nums){
            prefixSum += num%2;
            niceSubarraysCount += hm.getOrDefault(prefixSum - k, 0);
            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1);



        }
return niceSubarraysCount;

    }
}
