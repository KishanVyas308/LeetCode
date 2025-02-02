class Solution:
    def ans(self, n: int, a: int, b: int) -> int:
        if n == 0:
            return a
        return self.ans(n-1, b, a+b)
        
        
    def fib(self, n: int) -> int:
        return self.ans(n, 0, 1)
        