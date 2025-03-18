class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mapping = {")" : "(", "}" : "{", "]": "["}

        for ch in s:
            if ch in mapping.values():
                stack.append(ch)
            elif ch in mapping.keys():
                if not stack or mapping[ch] != stack.pop() :
                    return False
        
        return not stack