class Solution:
    def subarraySum(self, arr: List[int], k: int) -> int:
        n = len(arr)
        mpp = defaultdict(int)
        preSum = 0
        cnt = 0

        mpp[0] = 1
        for i in range(n):
            preSum += arr[i]
            remove = preSum - k
            cnt += mpp[remove]
            mpp[preSum] += 1
        return cnt