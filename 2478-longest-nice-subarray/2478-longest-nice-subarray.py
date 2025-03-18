from typing import List

class Solution:
    def longestNiceSubarray(self, nums: List[int]) -> int:
        left = 0
        bitmask = 0  # Stores OR of elements in the current window
        max_length = 0

        for right in range(len(nums)):
            # Shrink window from left if adding nums[right] causes a conflict
            while (bitmask & nums[right]) != 0:
                bitmask ^= nums[left]  # Remove nums[left] from bitmask
                left += 1
            
            # Add nums[right] to the bitmask
            bitmask |= nums[right]

            # Update max_length
            max_length = max(max_length, right - left + 1)

        return max_length
