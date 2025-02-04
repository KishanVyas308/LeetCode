class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        arr = []
        n = len(nums)
        k %= n
        for i in range(0, k, 1) :
            arr.append(nums[i])
        
        for i in range(n) :
            arr.append(nums[(i+k)%n])
            nums[(i+k)%n] = arr.pop(0)
    
        
        