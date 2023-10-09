class NumArray:

    def __init__(self, nums: List[int]):
        self.temp = [0]
        for i in nums:
            self.temp.append(self.temp[-1] + i)

    def sumRange(self, left: int, right: int) -> int:
        return self.temp[right + 1] - self.temp[left]

# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)
