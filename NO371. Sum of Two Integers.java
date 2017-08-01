/**Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
���⣺a+b��������+��-�š�
˼·�����еĻ������㶼������λ����ģ��ġ��������Ǿ��ֶ�ģ��ӷ���
	�ڶ������£��ӷ���Ϊ��ӦΪ��Ӻͽ�λ�����Ƿֿ����������λ��Ϊ0�������Ϊ0��
	���һ��0��һ��1������Ϊ1���������1������Ϊ�㣬Ȼ���λ�����Ƿ��֣���Ӳ������þ���
	���^������λ���þ�����(&)����˱����ת��Ϊ�����������ļӷ�������֤������λ��Ȼ����Ϊ0.
*/
public class Solution {
    public int getSum(int a, int b) {
        if(b==0) return a;
        return getSum(a^b,(a&b)<<1);
    }
}