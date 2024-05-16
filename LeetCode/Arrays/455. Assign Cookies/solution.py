class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()

        i = j = num_cookies = 0

        while i < len(g) and j < len(s):
            if s[j] >= g[i]:
                num_cookies += 1
                i += 1 
                j += 1
            
            else:
                j += 1
            
        return num_cookies
