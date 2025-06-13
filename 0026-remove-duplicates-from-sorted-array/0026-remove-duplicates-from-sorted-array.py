class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        curind = 1
        curval = nums[0]

        n = len(nums) 

        for i in range(1,n,1):
            if curval == nums[i] :
                continue
            nums[curind] = nums[i]
            curind += 1
            curval = nums[i]
        return curind