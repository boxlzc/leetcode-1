/**Given a non-empty binary tree, 
 * return the average value of the nodes on each level in the form of an array.
 * ���⣺����һ������������ÿһ��ڵ��value��ƽ��ֵ��
 * ˼·���򵥵Ķ���������������Ҫע�⣬��Ϊ����δ֪��������arraylist���գ�����������RE�˺ü���
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    int [] levelNode = new int[1000];
    double [] temp = new double[1000];
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<Double>();
        deepSearch(root,0);
        for(int i=0;i<temp.length;i++){
            if(levelNode[i]==0) break;
            ans.add(temp[i]/levelNode[i]);
        }
        return ans;
    }
    public void deepSearch(TreeNode node,int depth){
        levelNode[depth]++;
        temp[depth]+=(double)node.val;
        if(node.left!=null) deepSearch(node.left,depth+1);
        if(node.right!=null) deepSearch(node.right,depth+1);
        return ;
    }
}