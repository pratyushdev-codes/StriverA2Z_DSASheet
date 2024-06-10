class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;      // number of rows
        int m = matrix[0].length;   // number of columns

        int row = 0; 
        int col = m - 1;            // start from the top-right corner

        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
