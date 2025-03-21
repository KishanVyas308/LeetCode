class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n,m = len(matrix), len(matrix[0])
        # is zero then 0 else 1
        row = [1] * n
        col = [1] * m
        for i in range(n) :
            for j in range(m) :
                if matrix[i][j] == 0 :
                    row[i] = 0
                    col[j] = 0
        for i in range(n) :
            for j in range(m) :
                if row[i] == 0:
                    matrix[i][j] = 0
                if col[j] == 0:
                    matrix[i][j] = 0
