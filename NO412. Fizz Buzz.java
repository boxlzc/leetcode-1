/**
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output ��Fizz�� instead of the number and for the multiples of five output ��Buzz��. 
For numbers which are multiples of both three and five output ��FizzBuzz��.
���⣺����n�����㷵��1~n���ַ���������3�ı�����Fizz��ʾ��5�ı�����Buzz��ʾ��3��5ͬʱ�ı�����FizzBuzz��ʾ��
˼·��ûɶ˼·�ɣ���ѭ�������ˡ�����
*/
public class Solution {
    public List<String> fizzBuzz(int n) {
        Integer now= new Integer(0);
        List<String> ans=new ArrayList<String>();
        for(int i=1;i<=n;i++){
            now=i;
            if(i%3==0&&i%5==0){
                ans.add("FizzBuzz");
                continue;
            }
            if(i%3==0) ans.add("Fizz");
            else if(i%5==0) ans.add("Buzz");
            else ans.add(now.toString());
        }
        return ans;
    }
}