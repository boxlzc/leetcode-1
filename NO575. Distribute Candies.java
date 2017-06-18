/**Given an integer array with even length, where different numbers in this array represent different kinds of candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. 
 * Return the maximum number of kinds of candies the sister could gain.
 * ���⣺����2*n���ǹ��������ͱ�ʾ����һ���ʹ�����һ���ǹ�������2*n���Ƿָ�����������ˣ�һ��n��������������ֵܷ������ǣ�
 * ˼·�����ȣ���Ϊÿ����n���ǣ���ô��һ��С�ڵ���n��Ȼ�����ǿ�������������n����ʣ��n������硣
 * 		��ô���أ���Ȼ��ÿ�ֶ���һ��������ʱ���Ѿ��Զ��׼����������������n��ֻ����n�֣������м������ü��֡�
 * 		��������У�	
*/
public class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
        for(int candy: candies)  set.add(candy);
        return Math.min(set.size(),candies.length/2);
    }
}