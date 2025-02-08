class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        vals = set(nums)
        longest = 1

        for val in vals:
            if val-1 not in vals:
                temp = val
                ctn = 1
                while temp + 1 in vals:
                    ctn += 1
                    temp += 1
                longest = max(longest, ctn)
        return longest