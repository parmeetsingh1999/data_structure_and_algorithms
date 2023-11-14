class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == target) return i;
            else if(nums[i] > target) return i;
            else if(i == nums.length - 1 && nums[i] < target) return i + 1;
        }
        return 0;
    }
}
