class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        low, high = 1, max(piles)

        def can_eat_all(speed: int) -> bool:
            total_hour = 0
            for pile in piles:
                total_hour += math.ceil(pile/speed)
            return total_hour <= h
        
        while low < high :
            mid = (low + high) // 2
            if can_eat_all(mid):
                high = mid
            else :
                low = mid + 1
        return low