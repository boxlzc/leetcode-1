/**
Given a List of words, return the words that can be typed using letters of alphabet 
on only one row's of American keyboard like the image below.
���⣺����Щ�������ڼ�����ֻ��ͬһ�е���ĸ��ɵġ�
˼·���������ȷ��Ҳû��ʲô������㷨������java��ǿ��װ��ʹ��Ҫʹ�ø��������ͷ�����
	�Ƚ�ͬһ�е���ĸ����һ��map�У�Ȼ��ÿ������ȫת��ΪСд��Ȼ���ÿ�����ʵ�ÿ��
	��ĸ����ѯ��value��ȫһ���Ļ��ͷŵ��𰸵�ArrayList�У�����ٽ�ArrayListתΪ���鼴�ɡ�
*/
public class Solution {
    public String[] findWords(String[] words) {
        Map map=new HashMap();
        map.put('q',1);map.put('w',1);
        map.put('e',1);map.put('r',1);
        map.put('t',1);map.put('y',1);
        map.put('u',1);map.put('i',1);
        map.put('o',1);map.put('p',1);
        map.put('a',2);map.put('s',2);
        map.put('d',2);map.put('f',2);
        map.put('g',2);map.put('h',2);
        map.put('j',2);map.put('k',2);
        map.put('l',2);map.put('z',3);
        map.put('x',3);map.put('c',3);
        map.put('v',3);map.put('b',3);
        map.put('n',3);map.put('m',3);
        List <String> ansList=new ArrayList<String>();
        String [] lowerCase= new String [50];
        for(int i=0;i<words.length;i++){
            lowerCase[i]=words[i].toLowerCase();
            int row=Integer.parseInt(map.get(lowerCase[i].charAt(0)).toString());
            if(lowerCase[i].length()==1){
                ansList.add(words[i]);
                continue;
            }
            for(int j=1;j<lowerCase[i].length();j++){
               
                if(row!=Integer.parseInt(map.get(lowerCase[i].charAt(j)).toString()))
                    break;
                if(j==lowerCase[i].length()-1) ansList.add(words[i]);    
            }
        }
        String [] ans = new String[ansList.size()];
        for(int i=0;i<ansList.size();i++)
            ans[i]=ansList.get(i);
        return ans;
    }
}