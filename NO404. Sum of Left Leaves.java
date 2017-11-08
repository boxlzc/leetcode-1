/**
 * Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
���⣺����������е���ߵ�Ҷ�ӽڵ��ֵ֮�͡�
˼·��dfs���ɣ�ע���ж�����ڵ�����Ҷ�ӽڵ㡣
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
    public int sumOfLeftLeaves(TreeNode root) {
        int ans=0;
        if(root==null) return ans;
        if(root.left!=null){
            if(root.left.left==null&&root.left.right==null) ans+=root.left.val;
            ans+=sumOfLeftLeaves(root.left);
        }
        if(root.right!=null){
            ans+=sumOfLeftLeaves(root.right);
        }
        return ans;
    }
}