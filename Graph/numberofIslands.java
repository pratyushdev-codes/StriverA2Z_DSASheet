import java.util.*;

class Pair {
    int r;
    int c;

    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

public class numberofIslands {

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        System.out.println(numberofIsland(grid)); // Output: 3
    }

    public static int numberofIsland(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    count++;
                    BFS(grid, i, j, vis);
                }
            }
        }
        return count;
    }

    public static void BFS(char[][] grid, int i, int j, boolean[][] vis) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        vis[i][j] = true;

        int[] x_dir = {-1, 0, 1, 0};
        int[] y_dir = {0, -1, 0, 1};

        while (!q.isEmpty()) {
            Pair rem = q.poll();
            int row = rem.r;
            int col = rem.c;

            for (int d = 0; d < 4; d++) {
                int newRow = row + x_dir[d];
                int newCol = col + y_dir[d];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n
                        && grid[newRow][newCol] == '1' && !vis[newRow][newCol]) {
                    vis[newRow][newCol] = true;
                    q.add(new Pair(newRow, newCol));
                }
            }
        }
    }
}
