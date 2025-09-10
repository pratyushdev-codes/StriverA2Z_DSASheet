public class SearchInsertPos {
    public static int searchInsert(int arr[], int k) {
        int lo = 0;
        int high = arr.length - 1;
        while (lo <=high) {
            int mid = lo + (high - lo) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                lo = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return lo;
    }
}