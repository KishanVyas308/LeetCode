class Solution {
    public int[] minOperations(String boxes) {
      int n = boxes.length();
        int[] ans = new int[n];
        int count = 0;
        int operations = 0;

        // Left to right pass
        for (int i = 0; i < n; i++) {
            ans[i] += operations;
            count += boxes.charAt(i) == '1' ? 1 : 0;
            operations += count;
        }

        count = 0;
        operations = 0;

        // Right to left pass
        for (int i = n - 1; i >= 0; i--) {
            ans[i] += operations;
            count += boxes.charAt(i) == '1' ? 1 : 0;
            operations += count;
        }

        return ans;
    }
}