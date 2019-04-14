/*
You are given a binary tree in which each node contains an integer value.
Find the number of paths that sum to a given value.
*/
public class PathSumTwo {
  int count = 0;

  public int pathSum(TreeNode root, int sum) {
    if (root == null)
      return 0;

    traverse(root, sum);
    pathSum(root.left, sum);
    pathSum(root.right, sum);
    return count;
  }

  public void traverse(TreeNode root, int sum) {
    if (root == null)
      return;
    if (sum - root.val == 0)
      count++;
    traverse(root.left, sum - root.val);
    traverse(root.right, sum - root.val);
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