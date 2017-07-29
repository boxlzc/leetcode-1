/**Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
���⣺��һ���ַ������ж��Ƿ�Ϸ������ȫ�Ǵ�д����ȫ��Сд�ͺϷ������ֻ������ĸ��дҲ�Ϸ������಻�Ϸ�.
˼·����ģ�⼴�ɡ�
*/
public class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag=false;
        StringBuffer temp=new StringBuffer();
        char first =word.charAt(0);
        if(Character.isLowerCase(first)){
            flag=true;
            for(int i=1;i<word.length();i++){
                if(!Character.isLowerCase(word.charAt(i))){
                    flag=false;
                    break;
                }
            }
            
        }
        else{
            for(int i=1;i<word.length();i++)
                if(Character.isLowerCase(word.charAt(i))) temp.append(word.charAt(i));
            if(temp.length()==0||temp.length()==word.length()-1) flag=true;
                else flag=false;
        }
        return flag;
    }
}