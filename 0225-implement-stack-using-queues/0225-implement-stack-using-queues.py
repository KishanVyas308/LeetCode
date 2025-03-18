class MyStack:

    def __init__(self):
        self.li = []

    def push(self, x: int) -> None:
        self.li.append(x)

    def pop(self) -> int:
        if len(self.li):
            return self.li.pop()
        return 0

    def top(self) -> int:
        if len(self.li):
            return self.li[-1]
        return 0

    def empty(self) -> bool:
        return len(self.li) == 0
        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()