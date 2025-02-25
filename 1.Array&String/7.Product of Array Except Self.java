/*Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]*/

class Solution {
    public int[] productExceptSelf(int[] arr) {
        int prod=1;
        int count=0;
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                prod*=arr[i];
            else
                count++;
        }
        for(int i=0;i<arr.length;i++){
        int demo=prod;
            if(count==0){
                res[i]=demo/arr[i];
            }
            else if(count==1){
                if(arr[i]==0)
                    res[i]=demo;
                else
                    res[i]=0;
            }
            else{
                res[i]=0;
            }
        }
        return res;
    }
}
