/*Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"*/

class Solution {
    public String reverseVowels(String s) {
        boolean[] isVowel = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            isVowel[c] = true;
        }
        char[] characters = s.toCharArray();
        int i = 0, j = characters.length - 1;
        while (i < j) {
            while (i < j && !isVowel[characters[i]]) {
                ++i;
            }
            while (i < j && !isVowel[characters[j]]) {
                --j;
            }
            if (i < j) {
                char temp = characters[i];
                characters[i] = characters[j];
                characters[j] = temp;
                ++i;
                --j;
            }
        }
        return String.valueOf(characters);
    }
}
