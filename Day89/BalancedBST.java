/* 
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example 1:

Given the following tree [3,9,20,null,null,15,7]:

    3
   / \
  9  20
    /  \
   15   7
Return true.

*/
public class BalancedBST {
  public boolean isBalanced(TreeNode root) {
    if (root == null)
      return true;
    int left = getHeight(root.left);
    int right = getHeight(root.right);
    if (Math.abs(left - right) > 1) {
      return false;
    }
    return isBalanced(root.left) && isBalanced(root.right);

  }

  public int getHeight(TreeNode root) {
    if (root == null)
      return 0;
    return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
  }

  private class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}