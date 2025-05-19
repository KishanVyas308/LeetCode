class Solution:
    def isPalindrome(self, s: str) -> bool:
        filted = "".join(ch.lower() for ch in s if ch.isalnum())
        n = len(filted)
        for i in range((int)(n/2)) :
            if filted[i] != filted[n-i-1] :
                return False
        return True
        