/**
 * Given two binary trees and imagine that when you put one of them to cover the other, 
 * some nodes of the two trees are overlapped while the others are not.

	You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, 
	then sum node values up as the new value of the merged node. 
	Otherwise, the NOT null node will be used as the node of new tree.
*/
/**��Ŀ���⣺��������������������ÿ���ڵ���һ��value����Ҫ�������������ϲ���ʹ�¶������ڽṹ�ϰ�����
 * �����������������������Ľڵ㣬�µ�valueֵΪ֮ǰ����֮�͡�
 * Input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
*/
/**����˼·���ݹ�ϲ�����2���ӵ�1���ϣ���2������ڵ㣨���ҽڵ㣩����ԣ�
 * ��1������ڵ㣨���ҽڵ㣩���򴴽�һ���½ڵ㣬�����ݹ�ִ�С�
 * ע��������һ��Сtrick����������ֱ�Ӹ�������һ����Ϊ�������������Ҫ���У�
 * 
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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null) return t2;//�����Ƿ�Ϊ����
        if(t2==null) return t1;
        t1.val+=t2.val;
        if(t2.left!=null){
            if(t1.left!=null)   t1.left=mergeTrees(t1.left,t2.left);
            else t1.left=mergeTrees(new TreeNode(0),t2.left);
        }
        if(t2.right!=null){
            if(t1.right!=null)   t1.right=mergeTrees(t1.right,t2.right);
            else t1.right=mergeTrees(new TreeNode(0),t2.right);
        }
        return t1;
    }
}