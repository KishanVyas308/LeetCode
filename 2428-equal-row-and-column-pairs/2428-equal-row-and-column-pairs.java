class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> map = new HashMap<>();

        for(int[] row : grid) {
            String rowVal = Arrays.toString(row);
            map.put(rowVal, 1 + map.getOrDefault(rowVal, 0));
        }
        int totalPairs = 0;
        for(int c=0, len = grid.length; c<len; c++) {
            int[] col = new int[len];
            for(int r=0; r<len; r++) {
                col[r] = grid[r][c];
            }
            totalPairs += map.getOrDefault(Arrays.toString(col),0);
        }
        return totalPairs;
    }
}