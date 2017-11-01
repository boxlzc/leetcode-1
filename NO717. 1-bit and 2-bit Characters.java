/**
 * We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).

Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.
 	���⣺��һ��01�����зָ�ָʽΪ�����ַ�һ��Ļ�ֻ����0�������ַ�һ�������10����11�����Ƿ����ô�ĩβ����һ������һ���0
 	˼·���ǳ��򵥣�����0���ǲ��ùܣ���Ϊ������һ��һ�飬����1�Ļ������Ǿ�ǿ�������ͺ�����Ǹ���һ�飬�����Ǽ�
 			������ͷɨ��һ�飬�����ɨ�����һ����������0�Ļ�������ָ��������������㡣
 *
 */


class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n= bits.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(i==n-1){
                if(bits[i]==0) {
                    ans=1;
                    break;
                }
            }
            if(bits[i]==1){i++;}
        }
        if(ans>0) return true;
        else return false;
    }
}