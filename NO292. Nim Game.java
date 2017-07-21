/**You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. 
 * You will take the first turn to remove the stones.

Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.

For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 * ���⣺����nim��Ϸ��������������ʯ�ӣ�ÿ���˿��������1-3�����õ����һ��ʯ�ӵ���ʤ���������֣��ٶ����������������Ų��ԣ�����ʯ������n�������ܲ��ܱ�ʤ��
 * ˼·�����䲩�������⡣4��������һ���ؼ������<4������һ�ο�ȫ���ߣ����ֱ�ʤ�����=4�������ο�ȫ���ߣ����ֱذܡ��������Ƿ���8�����Է�Ϊ����4����ͬ�����ֱذܡ�
 * 		�����ҵ����ɣ��������Ϊ4�ı����������س���4������������ֱذܣ���֮���ֱ�ʤ��
 * 		�������С�
 * 
*/

public class Solution {
    public boolean canWinNim(int n) {
        if(n%4!=0) return true;
        else return false;
    }
}