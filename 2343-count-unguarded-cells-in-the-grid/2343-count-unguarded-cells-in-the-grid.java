class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] ans = new int[m][n];
        int count = m * n;

        // Mark guards and walls
        for (int[] guard : guards) {
            ans[guard[0]][guard[1]] = 2; // Guard
            count--;
        }

        for (int[] wall : walls) {
            ans[wall[0]][wall[1]] = 3; // Wall
            count--;
        }

        // Directions: {row, col} -> {up, down, left, right}
        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        // Traverse and mark guarded cells
        for (int[] guard : guards) {
            int x = guard[0];
            int y = guard[1];

            for (int[] dir : directions) {
                int nx = x, ny = y;

                // Move in the current direction
                while (true) {
                    nx += dir[0];
                    ny += dir[1];

                    // Stop if out of bounds or hitting a wall/guard
                    if (nx < 0 || nx >= m || ny < 0 || ny >= n || ans[nx][ny] == 3 || ans[nx][ny] == 2) {
                        break;
                    }

                    // Mark guarded cells if not already guarded
                    if (ans[nx][ny] == 0) {
                        ans[nx][ny] = 1; // Guarded
                        count--;
                    }
                }
            }
        }

        return count;
    }
}
