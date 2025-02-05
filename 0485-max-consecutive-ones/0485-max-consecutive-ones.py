class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max1 = 0
        cur1 = 0
        for num in nums:
            if num == 0:
                max1 = max(max1, cur1)
                cur1 = 0
            else :
                cur1 +=1
        return max(max1, cur1)
        