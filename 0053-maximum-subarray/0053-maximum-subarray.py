class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        cur_max, max_till_now = 0, -inf

        
        for num in nums:
            cur_max = max(num, cur_max+num)
            max_till_now = max(max_till_now, cur_max)
        return max_till_now