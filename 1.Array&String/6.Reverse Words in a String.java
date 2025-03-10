/*Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.*/

class Solution
{
    public String reverseWords(String s) 
    {
        String word = s.trim();

        String[] half = word.split("\\s+"); 
        String res = "";
        for(int i = half.length-1;i>=0;i--)
        {
            res+=half[i];
            if(i!=0)
            {
                res+=" ";
            }
        }
        return res;
    }
}
