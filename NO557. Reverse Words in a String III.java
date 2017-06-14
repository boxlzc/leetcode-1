/**
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
���⣺��������һ��Ӣ���е�ÿ�����ʷ�ת���������仰��
˼·��String����һ������String [] spilt(String regex),�������ǽ���String��ָ���ָ���𿪣�
		���ز𿪺���ַ������顣
	String��û�з�ת�ַ����ķ�������StringBuffer�У����ǿ�����תStringBuffer�����ת����
	����String��ķ���������ĵ���֪���ˡ�
*/
public class Solution {
    public String reverseWords(String s) {
        String [] ans=new String[100];
        ans=s.split(" ");
        String finalAns=new String();
        for(int i=0;i<ans.length;i++){
            StringBuffer temp=new StringBuffer(ans[i]);
            temp=temp.reverse();
            finalAns+=temp.toString();
            if(i!=ans.length-1) finalAns+=" ";
        }
        return finalAns;
    }
}