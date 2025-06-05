public class paintersPartition {
    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int K = 2;

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < boards.length; i++) {
            sum += boards[i];
            max = Math.max(boards[i], max);
        }

        int low = max;
        int high = sum;
        int result = sum;

        while (low < high) {
            int mid = (low + high) / 2;
            if (allocateWalls(boards, K, mid) <= K) {
                high = mid;  // Try to find a smaller max time
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Minimum time required: " + low);
    }

    public static int allocateWalls(int[] boards, int K, int time) {
        int painter = 1;
        int boardsPainter = 0;

        for (int i = 0; i < boards.length; i++) {
            if (boards[i] > time) return Integer.MAX_VALUE; // Cannot paint this board

            if (boardsPainter + boards[i] <= time) {
                boardsPainter += boards[i];
            } else {
                painter++;
                boardsPainter = boards[i];
            }
        }

        return painter;
    }
}
