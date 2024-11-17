class Solution {
    public int shortestSubarray(int[] nums, int k) {
       int n = nums.length;
        long[] prefix = new long[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // Deque to store indices of prefix sums
        Deque<Integer> deque = new LinkedList<>();
        int minLength = Integer.MAX_VALUE;

        // Iterate through the prefix sum array
        for (int i = 0; i <= n; i++) {
            // Check if we can form a valid subarray
            while (!deque.isEmpty() && prefix[i] - prefix[deque.peekFirst()] >= k) {
                minLength = Math.min(minLength, i - deque.pollFirst());
            }

            // Maintain the monotonic property of the deque
            while (!deque.isEmpty() && prefix[i] <= prefix[deque.peekLast()]) {
                deque.pollLast();
            }

            // Add current index to the deque
            deque.offerLast(i);
        }

        return minLength == Integer.MAX_VALUE ? -1 : minLength;

    }
}