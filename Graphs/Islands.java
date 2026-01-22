import java.util.*;

class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        int[][] directions = {
            {1, 0},  // down
            {-1, 0}, // up
            {0, 1},  // right
            {0, -1}  // left
        };

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    islands++;

                    // Start BFS
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{r, c});
                    grid[r][c] = '0'; // mark visited

                    while (!queue.isEmpty()) {
                        int[] cur = queue.poll();
                        int x = cur[0], y = cur[1];

                        for (int[] d : directions) {
                            int nx = x + d[0];
                            int ny = y + d[1];

                            if (nx >= 0 && ny >= 0 &&
                                nx < rows && ny < cols &&
                                grid[nx][ny] == '1') {

                                queue.offer(new int[]{nx, ny});
                                grid[nx][ny] = '0'; // mark visited
                            }
                        }
                    }
                }
            }
        }
        return islands;
    }
}
