/* 
Given a binary tree, check whether it is a mirror of itself 
(ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
*/
public class SymmetricTree {
  public boolean isSymmetric(TreeNode root) {
    if (root == null)
      return true;
    return isSymmetry(root.left, root.right);
  }

  public boolean isSymmetry(TreeNode left, TreeNode right) {
    if (left == null && right == null)
      return true;
    if (left == null && right != null || left != null && right == null || left.val != right.val) {
      return false;
    }
    return isSymmetry(left.left, right.right) && isSymmetry(left.right, right.left);
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