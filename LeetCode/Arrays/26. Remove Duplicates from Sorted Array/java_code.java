class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int distinct_length = 1;
        for(int i=1; i<nums.length; i++)
        {    
            if(nums[i-1] != nums[i])
            {
                nums[distinct_length] = nums[i];
                distinct_length++; 
			}
        }
        return distinct_length;
    }
}
