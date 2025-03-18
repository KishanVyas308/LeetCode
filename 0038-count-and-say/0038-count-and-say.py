class Solution:
    def countAndSay(self, n: int) -> str:
        if n == 1:
            return "1"

        result = "1"

        for _ in range(n - 1):
            temp = ""
            count = 1
            prev_char = result[0]

            for j in range(1, len(result)):
                if result[j] == prev_char:
                    count += 1
                else:
                    temp += str(count) + prev_char
                    prev_char = result[j]
                    count = 1
            
            # Append the last counted character
            temp += str(count) + prev_char
            result = temp  # Update result to next sequence

        return result
