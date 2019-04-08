import java.util.*;

/* 
Given a binary tree, return the level order traversal of its nodes' values. 
(ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
*/
public class BinaryTreeLevelOrderTraversal {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new LinkedList<>();
    Queue<TreeNode> q = new LinkedList<>();
    if (root == null)
      return res;
    q.offer(root);
    while (!q.isEmpty()) {
      List<Integer> subList = new ArrayList<>();
      int size = q.size();
      for (int i = 0; i < size; i++) {
        TreeNode n = q.poll();
        subList.add(n.val);
        if (n.left != null)
          q.offer(n.left);
        if (n.right != null)
          q.offer(n.right);

      }
      res.add(subList);
    }
    return res;
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