/* 
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
Example 1:

Input:
    2
   / \
  1   3
Output: true
*/
public class ValidBST {
  public boolean isValidBST(TreeNode root) {
    long maxVal = Long.MAX_VALUE;
    long minVal = Long.MIN_VALUE;
    return checkValidBST(root, minVal, maxVal);
  }

  public boolean checkValidBST(TreeNode root, long minVal, long maxVal) {
    if (root == null)
      return true;

    if (root.val > minVal && root.val < maxVal) {
      return checkValidBST(root.left, minVal, (long) root.val) && checkValidBST(root.right, (long) root.val, maxVal);
    } else {
      return false;
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