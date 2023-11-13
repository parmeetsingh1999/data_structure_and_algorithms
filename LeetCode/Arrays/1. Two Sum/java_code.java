import java.util.*;
import java.lang.Math;

class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            int x = nums[i];
            int y = target - x;
            Integer j = hm.get(y);
            if(j != null)
            {
                res[0] = j;
                res[1] = i;
                break;
            }
            hm.put(x, i);
        }
        return res;
    }
}
