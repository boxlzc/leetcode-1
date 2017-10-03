/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.
���⣺���������ַ������ж�1���Ƿ������2���е��ַ�ƴ�ӵõ���
˼·����Ϊ����Сд��ĸ��ֻҪ�ж�2���е��ַ��ǲ��Ǳ�1��������ˡ�
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] map= new int[30];
        for(int i=0;i<magazine.length();i++)
                map[magazine.charAt(i)-'a']++;
        for(int i=0;i<ransomNote.length();i++){
            if(map[ransomNote.charAt(i)-'a']<=0) return false;
            else map[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}