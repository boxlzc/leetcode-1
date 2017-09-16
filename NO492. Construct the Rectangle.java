/**
 * or a web developer, it is very important to know how to design a web page's size. So, given a specific rectangular web page��s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:

1. The area of the rectangular web page you designed must equal to the given target area.

2. The width W should not be larger than the length L, which means L >= W.

3. The difference between length L and width W should be as small as possible.
 * ���⣺��һ�����ֳ���������ˣ�Ҫ���һ�������ڵڶ������������������С��
 * ˼·������nö�پ��У�ע��һ����ȡ�����⡣
 */
class Solution {
    public int[] constructRectangle(int area) {
        int [] ans= new int [2];
        for(int ans1=(int)Math.ceil(Math.sqrt(area));ans1<=area;ans1++){
            if(area%ans1==0){
                ans[0]=ans1;
                ans[1]=area/ans1;
                break;
            }
        }
        return ans;
    }
}