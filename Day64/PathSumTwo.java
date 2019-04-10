import java.util.*;

/* 
Given a binary tree and a sum, find all root-to-leaf paths 
where each path's sum equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:

[
   [5,4,11,2],
   [5,8,4,5]
]
*/
public class PathSumTwo {
  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> res = new ArrayList<>();
    getSum(root, sum, res, new ArrayList<>());
    return res;
  }

  public void getSum(TreeNode root, int sum, List<List<Integer>> res, ArrayList list) {
    if (root == null)
      return;
    list.add(root.val);
    if (root.left == null && root.right == null && sum - root.val == 0) {
      res.add(new ArrayList<>(list));
    }
    getSum(root.left, sum - root.val, res, new ArrayList<>(list));
    getSum(root.right, sum - root.val, res, new ArrayList<>(list));
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