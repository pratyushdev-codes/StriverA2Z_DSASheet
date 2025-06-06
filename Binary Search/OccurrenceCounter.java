public class OccurrenceCounter {
    
    // Function to find the first occurrence of X
    public static int firstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result = mid;
                high = mid - 1;  // Keep searching on the left
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Function to find the last occurrence of X
    public static int lastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result = mid;
                low = mid + 1;  // Keep searching on the right
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Main function to count occurrences
    public static int countOccurrences(int[] arr, int x) {
        int first = firstOccurrence(arr, x);
        if (first == -1) return 0; // X not found
        int last = lastOccurrence(arr, x);
        return last - first + 1;
    }

    // Example usage
    public static void main(String[] args) {
        int[] array1 = {2, 2, 3, 3, 3, 3, 4};
        int x1 = 3;
        System.out.println(countOccurrences(array1, x1)); // Output: 4

        int[] array2 = {1, 1, 2, 2, 2, 2, 2, 3};
        int x2 = 2;
        System.out.println(countOccurrences(array2, x2)); // Output: 5
    }
}
