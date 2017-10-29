/**
 * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
���⣺һ���������ȶ���Ϊ�����г�������Ԫ�س��ֵĴ���������һ�����飬����������һ���ִ���ʹ�������ԭ����ͬ�Ҿ����̡�
˼·���ִ�����Ҫ���������ģ�����ֻ�ͳ������Ԫ�ص����Ҷ˵��йأ����Ǿͼ�¼ÿ��ֵ�����Ҷ˵㣬����̵ļ��ɡ��Ƚϱ�����
��Ϊ���������С��50000���������鼴�ɡ�
 */
class Solution {
    public int findShortestSubArray(int[] nums) {
         int left[] = new int[50001];
         int right[]= new int[50001];
         int times[]= new int[50001];
         int maxx=0;
         int ans=50000;
        for(int i=0;i<nums.length;i++){
            int now=nums[i];
            if(left[now]==0) {
                left[now]=i+1;
                right[now]=i+1;
            }
            else right[now]=i+1;
            times[now]++;
            if(times[now]>maxx)
                maxx=times[now];
        }
        for(int i=0;i<nums.length;i++){
            if(maxx==times[nums[i]])
                ans=Math.min(right[nums[i]]-left[nums[i]]+1,ans);
        }
        return ans;
    }
}