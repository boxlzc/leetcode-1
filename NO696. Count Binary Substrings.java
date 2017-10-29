/**
 * Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.
���⣺�ҳ�01��s�����������������ִ�������Ϊ��01����������ͬ����0������һ��1������һ��
˼·����Ϊ���ǵ��ִ���01������һ��ģ�����һ����0000000111111���֣�����11111100000���֡�
	  ��ֻ����һ��Ψһ�ķֽ�㣬��ô����ֽ����ԭ����Ҳ���ڡ�����ֻ��Ҫ��ԭ������01�ֽ��
	  �𿪣���ÿ����֮�䶼���Թ���һЩ�ִ����ִ�����Ϊ������01�ַ�����Сֵ��
 */
class Solution {
    public int countBinarySubstrings(String s) {
        int together [] = new int[s.length()];
        int now=0;
        together[now]++;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                now++;
                together[now]++;
            }
            else together[now]++;
        }
        int ans=0;
        for(int i=1;i<=now;i++)
            ans+=Math.min(together[i],together[i-1]);
        return ans;
    }
}