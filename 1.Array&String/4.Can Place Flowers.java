/*Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false*/

class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int length = flowerbed.length;
        for (int i = 0; i < length; ++i) 
        {
            int left = i == 0 ? 0 : flowerbed[i - 1];
            int right = i == length - 1 ? 0 : flowerbed[i + 1];
            if (left + flowerbed[i] + right == 0) {
                flowerbed[i] = 1;
                --n;
            }
        }
        return n <= 0;
    }
}
