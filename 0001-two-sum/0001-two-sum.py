class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        nMap = {}

        n = len(nums)

        for i in range(n) :
            remain = target - nums[i]
            if(remain in nMap) :
                return [nMap[remain], i]
            nMap[nums[i]] = i
        return [-1, -1]