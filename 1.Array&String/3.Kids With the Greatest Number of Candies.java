/*Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
*/
class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        ArrayList arr = new ArrayList<>();
        int max = candies[0];
        for(int i = 1;i<candies.length;i++)
        {
            if(max<=candies[i])
            {
                max = candies[i];
            }
        }
        for(int i = 0;i<candies.length;i++)
        {
            if((candies[i]+extraCandies)>=max)
            {
                arr.add(true);
            }
            else
            {
                arr.add(false);
            } 
        }
        return arr;
    }
}
