/**
 * Given a binary tree, return the tilt of the whole tree.

The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.

The tilt of the whole tree is defined as the sum of all nodes' tilt.

���⣺�������һ�ö�������ʲôʲôȨֵ�͡�һ�����Ȩֵ����Ϊ��������������Node��val����������
 *   ������Node��val��֮��ľ���ֵ����������������нڵ��Ȩֵ�͡�
 *   
 *    
 ˼·������һ�飬��ȫ�ֱ�����¼ÿ���ڵ��Ȩֵ���ɣ�ˮ�⡣ 
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
class Solution {
    int ans=0;
    public int dfs(TreeNode root){
        int leftVal=0,rightVal=0;
        if(root==null) return 0;
        if(root.left!=null) leftVal=dfs(root.left);
        if(root.right!=null) rightVal=dfs(root.right);
        ans+=Math.abs(rightVal-leftVal);
        return leftVal+rightVal+root.val;
    }
    public int findTilt(TreeNode root) {
        dfs(root);
        return ans;
    }
}