class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        maxSum = 0
        curSum = nums[0]
        for i in range(1,len(nums), 1) :
            if nums[i-1] < nums[i] :
                curSum += nums[i]
                maxSum = max(maxSum, curSum)
            else :
                maxSum = max(maxSum, curSum)
                curSum = nums[i]
        maxSum = max(maxSum, curSum)
        return maxSum



        