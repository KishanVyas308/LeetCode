class Solution:
    def predictPartyVictory(self, senate: str) -> str:
        radiant = deque()
        dire = deque()
        
        # Populate the queues with the indices of senators
        for i, s in enumerate(senate):
            if s == 'R':
                radiant.append(i)
            else:
                dire.append(i)
        
        n = len(senate)
        # Process the queues
        while radiant and dire:
            r = radiant.popleft()
            d = dire.popleft()
            
            # The senator with the smaller index gets to ban the other
            if r < d:
                # Radiant bans Dire, Radiant senator gets back in line
                radiant.append(r + n)
            else:
                # Dire bans Radiant, Dire senator gets back in line
                dire.append(d + n)
        
        # If Radiant queue is not empty, they win; otherwise Dire wins
        return "Radiant" if radiant else "Dire"