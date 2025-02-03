class Solution:
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        low, high = 1, max(nums)  

        while low < high:
            mid = (low + high) // 2

            totalSum = sum(math.ceil(num / mid) for num in nums)  

            if totalSum > threshold:
                low = mid + 1
            else:
                high = mid

        return low

        