/**Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * 
 * ���⣺�����������⣬����һ������n��ļ۸�����n������һ�Σ�����һ�Σ����������
 * ˼·��ɨ��һ�飬ά����ǰɨ�赽�Ľڵ��֮ǰ����Сֵ����������󼴿ɡ�
 * PS�������ı�ǩ��Ȼ��dp�������������˺þ���ת�Ʒ��̣�
 */
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minn=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<n;i++){
            minn=Math.min(minn,prices[i]);
            ans=Math.max(ans,prices[i]-minn);
        }
        return ans;
    }
}