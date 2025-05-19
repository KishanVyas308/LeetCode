class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        ch_map = {'}' : '{', ']' : '[', ')' : '('}

        for ch in s:
            if ch in ch_map.values():
                stack.append(ch)
            else :
                if not stack or ch_map[ch] != stack.pop():
                    return False
        return not stack
