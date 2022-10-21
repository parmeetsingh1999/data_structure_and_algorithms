class Solution:
	def find_median(self, v):
	    size = len(v)
	    v.sort()
	    if size % 2 == 0:
	        middle1 = v[size // 2]
	        middle2 = v[size // 2 - 1]
	        return (middle1 + middle2) // 2
	    else:     
	        return v[size // 2]

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n = int(input())
		v = list(map(int,input().split())) 
		ob = Solution();
		ans = ob.find_median(v)
		print(ans)
