class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a,b) -> Integer.compare(a[0], b[0]));

        int maxBeauty = 0;
        for (int i = 0; i < items.length; i++) {
            maxBeauty = Math.max(maxBeauty, items[i][1]);
            items[i][1] = maxBeauty;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            int idx = binarySearch(items, query);
            if (idx != -1) {
                ans[i] = items[idx][1]; 
            }
        }

        return ans;
        
       
    }

      private int binarySearch(int[][] items, int target) {
        int left = 0;
        int right = items.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (items[mid][0] <= target) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}