class Solution:
    def minOperations(self, nums: List[int]) -> int:
        n = len(nums)
        nums.append(0)
        for i in range(n-2) :
            if nums[i] == 0 :
                nums[i] = 1
                nums[i + 1] ^= 1
                nums[i + 2] ^= 1
                nums[-1] += 1
                
        
        return nums[-1] if (nums[n - 2] == 1 and nums[n - 1] == 1) else -1
            

        