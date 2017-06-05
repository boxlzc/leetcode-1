/*Given an array of 2n integers, 
your task is to group these integers into n pairs of integer, 
say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) 
for all i from 1 to n as large as possible.*/
/*��2n�����ֳ�n�飬ÿ����������ʹ�á�min(ai,bi)���*/
/*˼·��������С�������������˭һ���������͵�һ�����������������һ��
 *		����һ���൱���˷�����������ˣ�����Ҫ������һ������С�������
 *		��õ�����Ǻʹ�С������ԡ��������Ǳ��뵽��Է����������ÿ
 *		��������һ�顣ʵ��Ҳ�ǳ��򵥡�
 */

import java.util.Arrays;
public class Solution {
    public int arrayPairSum(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2)
            ans+=nums[i];
        return ans;    
    }
}