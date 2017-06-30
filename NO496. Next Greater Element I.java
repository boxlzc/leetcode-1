/**
You are given two arrays (without duplicates) nums1 and nums2 where nums1��s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.
���⣺���������飬��������һΪ��������Ӽ�����������һ��ÿ�����ġ���һ�������������
		����һ�����������������Ϊ�����������������ұߵ�һ�������������
˼·�����Ƕ��������ǰ�����ǣ���Ϊһ����һ���ҵ���һ������������󣬾���Զ������ˣ����ǿ���ά��һ������ջ��
	ջ��Ԫ�ص����ݼ����������ڵ�ǰԪ�أ���ջ�ڱ���С��ȫ����ջ����Щ���ġ���һ��������������Ѿ��ҵ����ڽ���ǰԪ��ѹ
	��ջ���ɡ�
*/
public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<nums.length;i++){
            while(!stack.empty()&&stack.peek()<nums[i]) map.put(stack.pop(),nums[i]);
            stack.push(nums[i]);
        }
        for(int i=0;i<findNums.length;i++)
            if(map.containsKey(findNums[i])) findNums[i]=map.get(findNums[i]);
            else findNums[i]=-1;
    
        return findNums;
    }
}