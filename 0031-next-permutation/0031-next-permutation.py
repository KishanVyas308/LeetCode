class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        dip = -1
        for i in range(n-2, -1, -1) :
            
            if nums[i] < nums[i+1] :
                dip = i
                break
            
            
        if dip == -1:
            nums.reverse()
            return
        for i in range(n-1, dip, -1) :
            if nums[i] > nums[dip]:
                nums[dip], nums[i] = nums[i], nums[dip]
                break
        nums[dip+1:] = reversed(nums[dip+1:])
        

                    