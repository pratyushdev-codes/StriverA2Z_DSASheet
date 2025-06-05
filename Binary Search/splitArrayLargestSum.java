class splitArrayLargestSum{
public int splitArray(int[] nums, int k) {
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int num : nums) {
        max = Math.max(max, num);
        sum += num;
    }
    int low = max, high = sum;
    int ans = high;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (canSplit(nums, mid, k)) {
            ans = mid;
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return ans;
}

private boolean canSplit(int[] nums, int mid, int k) {
    int count = 1;
    int currentSum = 0;
    for (int num : nums) {
        if (currentSum + num > mid) {
            count++;
            currentSum = num;
        } else {
            currentSum += num;
        }
    }
    return count <= k;
}
}