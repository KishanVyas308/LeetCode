class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        curI = 0
        curVal = nums[0]
        for i in range(1,len(nums), 1) :
            if curVal != nums[i] :
                curI += 1
                nums[curI] = nums[i]
                curVal = nums[i]
        return curI+1
        