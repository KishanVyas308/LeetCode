class Solution:

    def minPathSum(self, grid: List[List[int]]) -> int:
        if not grid or not grid[0]:
            return 0
        
        rows, cols = len(grid), len(grid[0])
        
        # Modify grid in place for space optimization
        for i in range(rows):
            for j in range(cols):
                if i == 0 and j == 0:
                    continue  # Starting point
                elif i == 0:
                    grid[i][j] += grid[i][j - 1]  # Only from the left
                elif j == 0:
                    grid[i][j] += grid[i - 1][j]  # Only from above
                else:
                    grid[i][j] += min(grid[i - 1][j], grid[i][j - 1])  # Min of top or left
        
        return grid[-1][-1]  # Bottom-right corner holds the answer
        