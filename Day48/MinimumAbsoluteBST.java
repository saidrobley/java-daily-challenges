/* 
Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
Example:
Input:

   1
    \
     3
    /
   2

Output:
1
*/
public class MinimumAbsoluteBST {
  int min = Integer.MAX_VALUE;
  Integer prev = null;

  public int getMinimumDifference(TreeNode root) {
    if (root == null) {
      return min;
    }
    getMinimumDifference(root.left);
    if (prev != null) {
      min = Math.min(min, root.val - prev);
    }
    prev = root.val;
    getMinimumDifference(root.right);

    return min;

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