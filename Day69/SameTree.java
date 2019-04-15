/* 
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally 
identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
*/
public class SameTree {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    } else if ((p == null && q != null) || (p != null && q == null)) {
      return false;
    } else if (p.val != q.val) {
      return false;
    } else {
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

  }

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}