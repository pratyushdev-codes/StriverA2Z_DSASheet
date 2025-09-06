public class MajorityElement {
    public static void main(String[] args) {
        
    } public int majorityElement(int[] nums) {
    //     HashMap<Integer, Integer> hm = new HashMap<>();
        
    //     // Count frequencies
    //     for (int num : nums) {
    //         hm.put(num, hm.getOrDefault(num, 0) + 1);
    //     }
        
    //     int n = nums.length / 2;
        
    //     // Find the majority element
    //     for (var entry : hm.entrySet()) {
    //         if (entry.getValue() > n) {
    //             return entry.getKey();
    //         }
    //     }
        
    //     return -1; // fallback, though problem guarantees majority exists
    // }
    int count =0 , candidate =0;
    for(int num : nums){
        if(count==0){
            candidate = num;
        }
        count+= (candidate==num)?1 :-1;
    }
    return candidate;
}
}
}
