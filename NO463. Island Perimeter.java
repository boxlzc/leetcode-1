/**
You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. 
Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, 
and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" 
(water inside that isn't connected to the water around the island). 
One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. 
Determine the perimeter of the island.
���⣺��һ������������1����½�أ�0����ˮ��½�ض�������һ��ģ�Ȼ��ÿ��С��߳�Ϊ1����½�ص��ܳ��Ƕ��٣�
˼·�����������룺������е�½�ض��Ǳ˴�Զ��ģ���ô�𰸾���½����*4�����������������ô���Ӵ��ı߾ͱ����������Σ�
	���ˣ��𰸺�֮����������ÿ��½�ش���+4������������½����ô��-2��������ϱ���½����ô��-2��
	���O(n*m)��������𰸡�
*/
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
                for(int j=0;j<grid[i].length;j++){
                    if(grid[i][j]==1) ans+=4;
                    else continue;
                    if(i>0&&grid[i-1][j]==1) ans-=2;
                    if(j>0&&grid[i][j-1]==1) ans-=2;
                }
        return ans;
    }
}