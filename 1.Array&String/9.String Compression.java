/*Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".*/
class Solution {
    public int compress(char[] chars) {
        StringBuilder list=new StringBuilder();
        char a=chars[0];
        int count=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==a)
                count++;
            else if(chars[i]!=a){
                list.append(Character.toString(chars[i-1]));
                if(count>1)
                list.append(Integer.toString(count));
                a=chars[i];
                count=1;
            }
            if(i==chars.length-1){
                list.append(Character.toString(chars[i]));
                if(count>1)
                list.append(Integer.toString(count));
            }
        }
        for(int i=0;i<list.length();i++){
            chars[i]=list.charAt(i);
        }
        return list.length();
    }
}
