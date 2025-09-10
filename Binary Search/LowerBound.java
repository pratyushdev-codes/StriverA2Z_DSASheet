public class LowerBound {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int k = 5;

        int floorIndex = findFloor(arr, k);
        if (floorIndex == -1) {
            System.out.println("No floor exists for " + k);
        } else {
            System.out.println("Floor of " + k + " is " + arr[floorIndex] + " at index " + floorIndex);
        }
    }

    public static int findFloor(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1; // start with -1 (no floor found yet)

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                return mid; // exact match → floor found
            }

            if (arr[mid] < k) {
                ans = mid; // candidate floor
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
