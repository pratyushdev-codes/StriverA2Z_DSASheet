import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);  // Sort the array to handle duplicates easily
        sum(0, arr, ans, new ArrayList<>(), target);
        return ans;
    }

    private void sum(int index, int[] arr, List<List<Integer>> ans, List<Integer> temp, int target) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            // Skip duplicates
            if (i > index && arr[i] == arr[i - 1]) continue;
            // If the current element is greater than the target, break the loop
            if (arr[i] > target) break;

            // Include the current element in the combination
            temp.add(arr[i]);
            // Recur with next index
            sum(i + 1, arr, ans, temp, target - arr[i]);
            // Backtrack to explore other combinations
            temp.remove(temp.size() - 1);
        }
    }
}

