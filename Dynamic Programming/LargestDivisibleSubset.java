public class LargestDivisibleSubset {
    public static void main(String[] args) {
        
    }public List<Integer> LargestDivisibleSubset(int arr []){
        Arrays.sort(arr);
        int dp [] = new int [arr.length];
        List<Integer> result = new ArrayList<>();

    }private void helper(int[] nums, int index, List<Integer> curr, int prev) {
        if(curr.size() > res.size()) {
            res = new ArrayList<>(curr);
        }

        for(int i=index; i<nums.length; i++) {
            if(curr.size() > mem[i] && nums[i]%prev == 0) {
                mem[i] = curr.size();
                curr.add(nums[i]);
                helper(nums, i+1, curr, nums[i]);
                curr.remove(curr.size()-1);
            }
        }
    }
}