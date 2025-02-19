/* Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: "" */

public class Solution 
{

    public static String gcdOfStrings(String str1, String str2) 
    {
        if (!str1.concat(str2).equals(str2.concat(str1))) 
        {
            return "";
        }

        int len1 = str1.length();
        int len2 = str2.length();
        int gcdLen = gcd(len1, len2); 
        return str1.substring(0, gcdLen);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
