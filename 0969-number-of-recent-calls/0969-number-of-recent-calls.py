class RecentCounter:
    
    def __init__(self):
        self.queue = list()

    def ping(self, t: int) -> int:
        self.queue.append(t)
        if len(self.queue) != 0:
            while t-3000 >self.queue[0]:
                self.queue.pop(0)
            return len(self.queue)
        else:
            return 0

# Your RecentCounter object will be instantiated and called as such:
# obj = RecentCounter()
# param_1 = obj.ping(t)