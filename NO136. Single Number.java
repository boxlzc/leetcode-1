/**Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
���⣺һ�������г���һ�������඼�ǳ��������εģ�������O(n)��ʱ���O(1)�Ŀռ����ҵ��������
˼·����ͳ��Hash��ռ�̫�󣬿϶����У���ʱ�����뵽λ����^,����֪��x^xΪ0��0^x=x,����ֻҪ��������ȫ���һ�飬ʣ�µľ��Ǵ�����
*/
public class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int num:nums){
            ans^=num;
        }
        return ans;
    }
}