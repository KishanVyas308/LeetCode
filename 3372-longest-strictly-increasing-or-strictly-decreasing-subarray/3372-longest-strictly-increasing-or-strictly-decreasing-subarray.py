class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        if not nums:
            return 0  # Handle empty list case
        
        maxval = minval = 1  # Start with at least one element counted
        curmin = curmax = 1
        prev = nums[0]

        for i in range(1, len(nums)):  # Start from index 1
            num = nums[i]
            
            if num > prev:  # Increasing sequence
                curmax += 1
                curmin = 1  # Reset decreasing count
            
            elif num < prev:  # Decreasing sequence
                curmin += 1
                curmax = 1  # Reset increasing count
            
            else:  # num == prev (Break in sequence)
                curmax = curmin = 1  # Reset both counts
            
            maxval = max(maxval, curmax)
            minval = max(minval, curmin)
            prev = num  # Update prev for next iteration
        
        return max(maxval, minval)  # Return the longest increasing or decreasing length