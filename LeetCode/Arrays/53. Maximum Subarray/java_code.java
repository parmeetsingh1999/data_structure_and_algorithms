class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int[] arr = new int[nums.length];
        int temp = nums[0];
        arr[0] = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            arr[i] = Math.max(nums[i], nums[i] + arr[i - 1]);
            temp = Math.max(temp, arr[i]);
        }
        return temp;
    }
}
