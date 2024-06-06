/**
 * NextPermutation
 */
public class NextPermutation {

    public static void main(String[] args) {
        
    }public static void nextPermutation(int [] nums){
        int break =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<nums[i+1]){
                break= nums[i];

            }
        }
    }
}