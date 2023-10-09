import sys

class Solution:
    # @param A : list of integers
    # @param B : integer
    # @return an integer
    def solve(self, A, B):
        n = len(A)
        temp = n - 1
        count = 0
        window = B
        
        for i in range(B):
            count += A[i]
        
        max_value = -sys.maxsize
        i = 0
        
        while window != 0 and  i < B:
            count -= A[window - 1]
            count += A[temp]
            window -= 1
            temp -= 1
            max_value = max(count, max_value)
            i += 1
        return max_value
