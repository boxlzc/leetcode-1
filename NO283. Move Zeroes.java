/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
���⣺��һ�������е�����0�Ƶ�������������Ԫ�����˳�򲻱䡣ע�⣺Ҫ�����ռ䣬��������С��
˼·��ֻҪά����ǰ�ҵ��˼�����0ֵ�Ϳ��ԣ�O(n)��ʱ�䣬O(1)�Ŀռ䡣
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int now=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[now]=nums[i];
                now++;
            }
        }
        for(int i=now;i<n;i++)
                nums[i]=0;
    }
}