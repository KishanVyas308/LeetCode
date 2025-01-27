class Solution:
    def isPalindrome(self, s: str) -> bool:
        filterd = "".join(char.lower() for char in s if char.isalnum())
        for i in range(int(len(filterd)/2)):
            if filterd[i] != filterd[len(filterd)-i-1]:
                return False
        return True
        