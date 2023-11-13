class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        i = 0
        n = len(nums)
        res = []
        
        while i < n - 3:
            if target - nums[i] < 3 * nums[i + 1] or target - nums[i] > 3 * nums[-1]:
                while i < n - 4 and nums[i] == nums[i + 1]: i += 1
                i += 1
                continue
            j = i + 1
            while j < n - 2:
                if target - nums[i] - nums[j] < 2 * nums[j + 1] or target - nums[i] - nums[j] > 2 * nums[-1]:
                    while j < n - 3 and nums[j] == nums[j + 1]: j += 1
                    j += 1
                    continue
                left = j + 1
                right = n - 1
                new_target = target - nums[i] - nums[j]
                while left < right:
                    if nums[left] + nums[right] > new_target: right -= 1
                    elif nums[left] + nums[right] < new_target: left += 1
                    else:
                        res.append([nums[i], nums[j], nums[left], nums[right]])
                        temp_left = nums[left]
                        temp_right = nums[right]
                        while left < right and nums[left] == temp_left: left += 1
                        while left < right and nums[right] == temp_right: right -= 1
                while j < n - 3 and nums[j] == nums[j + 1]: j += 1
                j += 1
            while i < n - 4 and nums[i] == nums[i + 1]: i += 1
            i += 1
        return res
