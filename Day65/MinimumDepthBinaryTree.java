/* 
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path 
from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its minimum depth = 2.
*/
public class MinimumDepthBinaryTree {
  public int minDepth(TreeNode root) {

    if (root == null)
      return 0;
    if (root.left == null && root.right == null)
      return 1;

    int left = root.left != null ? minDepth(root.left) : Integer.MAX_VALUE;
    int right = root.right != null ? minDepth(root.right) : Integer.MAX_VALUE;
    return Math.min(left, right) + 1;
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