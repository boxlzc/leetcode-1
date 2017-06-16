/**
 * n MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
���⣺��������һ��a*b�ľ���תΪr*c�ľ����������ת���Ļ��ͷ���ת����ģ����򷵻�ԭ���ġ�
˼·�����a*b��=r*c����Ȼ����ת����Ȼ���µľ�����ԭ����һһ��Ӧ�����ˣ�ûʲô�Ѷȡ� 
*/
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int oldRow=nums.length;
        int oldColumn=nums[0].length;
        if(r*c!=oldRow*oldColumn) return nums;
        int [][] ans=new int [r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++){
                int cnt=i*c+j;
                ans[i][j]=nums[cnt/oldColumn][cnt%oldColumn];
            }
        return ans;    
    }
}