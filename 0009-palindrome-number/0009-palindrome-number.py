class Solution:
    def isPalindrome(self, x: int) -> bool:
        s = str(x)
        rev_s = s[::-1]
        return rev_s == s
        