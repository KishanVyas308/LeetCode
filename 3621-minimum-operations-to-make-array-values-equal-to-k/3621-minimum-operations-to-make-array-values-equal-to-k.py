class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        if k > min(nums) :
            return -1
        
        u_e = set(nums)
        u_c = len(u_e)

        if k in u_e :
            return u_c - 1
        return u_c