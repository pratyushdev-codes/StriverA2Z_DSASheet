public class CombinationSumIII {
    
}class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(1, k, n, new ArrayList<>(), ans);
        return ans;
    }

    private void solve(int i, int k, int n, List<Integer> curr, List<List<Integer>> ans) {
        if (n == 0 && k == 0) {
            ans.add(new ArrayList<>(curr)); // Make a copy of the current combination
            return;
        }
        if (i > 9) return;
        if (n < 0 || k < 0) return;

        // Pick the current number
        curr.add(i);
        solve(i + 1, k - 1, n - i, curr, ans);
        curr.remove(curr.size() - 1); // Backtrack by removing the last added number

        // Don't pick the current number
        solve(i + 1, k, n, curr, ans);
    }
}
