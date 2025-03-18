class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:

        stack = []
        hashMap = {}
        answer = []

        for num in nums2: 
            while stack and num > stack[-1]:
              hashMap[stack.pop()] = num
            stack.append(num)

        for el in nums1:
            if el in hashMap:
                answer.append(hashMap[el])
            else:
                answer.append(-1)

        return answer