class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        mini = prices[0]
        profit = 0

        for price in prices:
            mini = min(mini, price)
            profit = max(profit, price-mini)
        return profit