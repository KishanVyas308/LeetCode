class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < k) return 0;
        
        // Calculate the sum of the first k elements.
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double currentSum = maxSum;
        
        // Use sliding window to find the maximum sum of k consecutive elements.
        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum average.
        return maxSum / k;
    }
}