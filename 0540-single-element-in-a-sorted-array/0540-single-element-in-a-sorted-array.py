class Solution:
    def singleNonDuplicate(self, arr: List[int]) -> int:
        low, high = 0, len(arr)-1
        while low < high:
            mid = (low + high) // 2

            if mid % 2 == 1:
                mid -= 1
            
            if arr[mid] == arr[mid + 1]:
                low = mid + 2
            else:
                high = mid
        
        return arr[low]
        