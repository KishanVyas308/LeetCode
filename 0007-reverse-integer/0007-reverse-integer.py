class Solution:
    def reverse(self, x: int) -> int:
        ans = 0
        isNeg = x < 0  # Check if negative
        x = abs(x)  # Convert to positive

        while x > 0:  # Process each digit
            ans = (ans * 10) + (x % 10)
            x //= 10

        if isNeg:
            ans = -ans  # Convert back to negative

        # Correct overflow check
        if ans < -2**31 or ans > 2**31 - 1:
            return 0

        return ans
