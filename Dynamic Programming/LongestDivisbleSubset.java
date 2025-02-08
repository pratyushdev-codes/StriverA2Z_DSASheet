import java.util.*;
List<Integer> res;
int[] dp;
public class LongestDivisbleSubset {
    public static void main(String[] args) {
        
    }  public List<Integer> largestDivisibleSubset(int[] nums) {

        Arrays.sort(nums);

        res = new ArrayList<>();

        dp = new int [nums.length];
        Arrays.fill(dp , -1);

    }    private void helper(int[] nums, int index, List<Integer> curr, int prev) {
        if(curr.size()>res.size()){
            res= new ArrayList<>(curr);

        }

        for(int i = index ; i<=nums.length ; i++){
            if(curr.size()> dp[i] && nums[i]%prev==0){
                dp[i]= curr.size();
                curr.add(nums[i]);
                helper(nums, index+1, curr, nums[i]);
                curr.remove(curr.size()-1);
            }
        }




    }
}
