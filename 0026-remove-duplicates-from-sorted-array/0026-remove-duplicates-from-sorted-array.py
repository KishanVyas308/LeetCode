class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        curI = 1
        curVal = nums[0]

        n = len(nums)

        for i in range(1, n, 1) :
            if curVal != nums[i]:
                curVal = nums[i]
                nums[curI] = nums[i]
                curI += 1
        return curI

        