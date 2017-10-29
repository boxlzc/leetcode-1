/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
 However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * 
 * ���⣺����ÿ�����Ʒ�۸񣬿���������Σ���ͬʱ����ֻ����һ�������������
 * ˼·����Ϊ����ÿ�춼����һ��������ֻҪ����ı�����ߣ��Ϳ�������Ȼ������
 */
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ans=0;
        for(int i=1;i<n;i++)
            if(prices[i]>prices[i-1])
                    ans+=prices[i]-prices[i-1];
        return ans;
    }
}