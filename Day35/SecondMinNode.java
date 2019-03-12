/* 
Given such a binary tree, you need to output the second minimum value 
in the set made of all the nodes' value in the whole tree.
If no such second minimum value exists, output -1 instead.
Example 1:
Input: 
    2
   / \
  2   5
     / \
    5   7

Output: 5
Explanation: The smallest value is 2, the second smallest value is 5.
*/
public class SecondMinNode {
  public int findSecondMinimumValue(TreeNode root) {
    if (root == null) {
      return -1;
    }
    if (root.left == null && root.right == null) {
      return -1;
    }
    int left = root.left.val;
    int right = root.right.val;
    if (left == root.val) {
      left = findSecondMinimumValue(root.left);
    }
    if (right == root.val) {
      right = findSecondMinimumValue(root.right);
    }
    if (left != -1 && right != -1) {
      return Math.min(left, right);
    } else if (left != -1) {
      return left;
    } else {
      return right;
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