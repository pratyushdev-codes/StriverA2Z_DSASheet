
// ~ Longest Subarray with give Sum K (only non-negetive numbers)


class LongesSubaaraywithgivenSumK {
    public int longestSubarray(int[] nums, int k) {
        int left = 0, currSum = 0, maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];

            while (currSum > k && left <= right) {
                currSum -= nums[left];
                left++;
            }

            if (currSum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }
}
