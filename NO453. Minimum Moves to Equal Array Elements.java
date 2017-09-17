/**
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal,
 *  where a move is incrementing n - 1 elements by 1.
 *  ���⣺����һ��n��Ԫ�صķǿ����飬��ÿ�ο��Խ�����n-1��Ԫ��+1���ʶ��ٴβ������ܰ�����Ԫ�ر��һ���ġ�
 *  ˼·���������һЩ˼ά�����������������룬�迪ʼʱԪ�صĺ�Ϊsum������m�β�����һ�������һ��ʱÿ��Ԫ��Ϊx�������㣺
 *  		sum+m*(m-1)=x*n;
 *          x=minNum+m;
 *          ͨ��������ʽ�ӾͿ��Խ��m�ˡ�
 *          �ǲ��Ǻ�����˼��
 *
 */
class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int minNum=2147483647;
        int sum=0;
        for(int i=0;i<n;i++){
            minNum=Math.min(minNum,nums[i]);
            sum+=nums[i];
        }
        return sum-minNum*n;
    }
}