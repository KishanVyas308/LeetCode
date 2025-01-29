class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        ans = 0
        temp = abs(x)
        while temp > 0:
            ans = ans * 10 + (temp % 10)
            temp //= 10
        return ans == x

        