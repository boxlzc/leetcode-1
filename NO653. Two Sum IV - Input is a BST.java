/**
 * Given a Binary Search Tree and a target number, 
 * return true if there exist two elements in the BST such that their sum is equal to the given target.
 * ���⣺��һ��BST��һ��k����BST�Ƿ���������ڵ�valֵ֮��Ϊk��
 * ˼·������һ��BST�ϵĽڵ�val����ֻ��Ҫ֪���Ƿ���һ��k-val��������set��map��
 *       ��������һ��BST�����Խ�һ���Ż���������Щ������Ҫ�ˡ�
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
    Set<Integer> set = new HashSet<Integer>();
    public boolean findTarget(TreeNode root, int k) {
        
        if(find(root,k)) return true;
        else return false;
    }
    public boolean find(TreeNode root,int k){
        if(root==null) return false;
        if(set.contains(k-root.val)) return true;
        else set.add(root.val);
        if(find(root.left,k)) return true;
        if(find(root.right,k)) return true;
        return false;
    }
}