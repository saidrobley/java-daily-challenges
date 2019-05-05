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