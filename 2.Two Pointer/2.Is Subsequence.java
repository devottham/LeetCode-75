/*Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false*/
class Solution 
{
    public boolean isSubsequence(String s, String t) 
    {
        char s1 = 0,t1 = 0,count = 0;
        for(int i = 0;i<t.length()&&s1<s.length();i++)
        {
            if(s.charAt(s1)==t.charAt(t1))
            {
            s1++;
            t1++;
            count++;
            }
            else
            {
                t1++;
            }
        }
         if(count==s.length())
            return true;
        return false;
    }
}
