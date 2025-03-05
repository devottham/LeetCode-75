/*Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]*/
class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int i = 0;
        for(int j = 0;j<nums.length;j++)
        {
            if(nums[j] != 0)
            {
                nums[i++] = nums[j];
            }
        }
        while(i<nums.length)
        {
            nums[i++] = 0;
        }
        
    }
}
