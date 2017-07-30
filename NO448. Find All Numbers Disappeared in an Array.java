/**
 * Given an array of integers where 1 �� a[i] �� n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
	���⣺��һ������Ϊn�����飬����Ԫ����1~n֮�䣬����һЩԪ��û���֣�������O(n)��ʱ���O(1)�Ŀռ����ҵ�û���ֵ�Ԫ�ء�
	˼·�����ȣ�O(n)��ʱ��ܺ�����ֻ��Ҫɨһ��Ȼ���¼��Щ���ֹ����У��������Ҫ�������¼�����Թؼ�����ô���������ʡ����
		��ʱ��Ҫ��취�������������ϣ���μ�ʵ�ּ�¼�ֲ��ı������أ���������������¼ʱ+n��ȡ����ʱ%n�����߼�¼ʱȡ����ȡ����ʱȡ����ֵ��
		���õĵ�һ�ַ�����
*/
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans =new ArrayList<Integer> ();
        int n=nums.length;
        for(int i=0;i<n;i++) nums[(nums[i]-1)%n]+=n;
        for(int i=0;i<n;i++)
            if(nums[i]<=n) ans.add(i+1);
        return ans;
    }
}