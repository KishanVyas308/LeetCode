class Solution:
    def search(self, arr: List[int], k: int) -> bool:
        left, right = 0, len(arr)-1

        while left <= right :
            mid = (left + right) // 2

            if arr[mid] == k:
                return True
            
            if arr[left] == arr[mid] and arr[mid] == arr[right] :
                left += 1
                right -= 1
                continue
            
            if arr[left] <= arr[mid]:
                if arr[left] <= k <= arr[mid]:
                    right = mid - 1
                else :
                    left = mid + 1
            else:
                if arr[mid] <= k <= arr[right]:
                    left = mid + 1
                else:
                    right = mid - 1

        return False

 

