/**
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:
Google: 90% of our engineers use the software you wrote (Homebrew), 
but you can��t invert a binary tree on a whiteboard so fuck off.
���⣺��תһ���������������⡣
	�����������һ�����£���������macϵͳ��������������ߣ�
	Max HowellȥGoogle����ʱ����Ϊû���ڰװ���д���������⵽�ܾ���
	����������������㷨����Ҫ��
˼·�������ڵ�+���Ѽ��ɡ�ע���жϸ��Ƿ�Ϊ�ա�	
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        if(root.left!=null&&root.right!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
        else if(root.left!=null){
            root.right=root.left;
            root.left=null;
            invertTree(root.right);
            return root;
        }
        else if(root.right!=null){
            root.left=root.right;
            root.right=null;
            invertTree(root.left);
            return root;
        }
        else return root;
    }
}