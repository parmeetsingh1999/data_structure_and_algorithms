class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if target>nums[len(nums)-1]:
            return len(nums)
        for i in range(len(nums)):
            if target==nums[i]:
                return i
            else:
                if i==len(nums)-1:
                    if target<nums[i]:
                        return i
                else:
                    if target<nums[i]:
                        return i
