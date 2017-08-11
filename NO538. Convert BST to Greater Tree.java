/**Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.
 * convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.
	���⣺��һ��BST��Ҫ������нڵ��val��Ϊ���ڵ������������ڵ��val֮�͡�
	˼·������BST�Ķ������ٶȡ����۾����и������õ����������ϸ�����ġ�
			������һ�㣬���������ڸ������������������ÿ���ڵ��val+=֮ǰ��������val�ͣ�ά��һ����ǰ���������ܺ;����ˡ�
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
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        root=deepSearch(root);
        return root;
    }
    public TreeNode deepSearch(TreeNode node){
        if(node==null) return null;
        deepSearch(node.right);
        node.val+=sum;
        sum=node.val;
        deepSearch(node.left);
        return node;
    }
}