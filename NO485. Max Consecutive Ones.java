/**Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
���⣺��һ��0��1����Ҫ���ҵ��������һ��������1������䳤�ȡ�
˼·��O(n)��������¼���ֵ���ɡ�
*/
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0,maxx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans=Math.max(ans,maxx);
                maxx=0;
            }
            else    maxx++;
        }
        ans=Math.max(ans,maxx);
        return ans;
    }
}