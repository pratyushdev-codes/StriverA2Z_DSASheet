import java.util.*;

public class LongestSubarraywithGivenSumKPosNeg {
    public static void main(String[] args) {
        int arr[] = {7, 1, 6, 0};
        int reqSum = 7;

        Map<Integer, Integer> map = new HashMap<>(); 
        int currSum = 0, maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum == reqSum) {
                maxLength = i + 1;  // whole array till i
            }

            if (map.containsKey(currSum - reqSum)) {
                maxLength = Math.max(maxLength, i - map.get(currSum - reqSum));
            }

            // store only first occurrence
            if (!map.containsKey(currSum)) {
                map.put(currSum, i);
            }
        }

        System.out.println("Longest Subarray Length = " + maxLength);
    }
}
