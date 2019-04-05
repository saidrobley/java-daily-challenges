import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

/* 
Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
(ie, from left to right, level by level from leaf to root).
For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
*/
public class BinaryTreeLevelOrderTraversal {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    List<List<Integer>> res = new LinkedList<List<Integer>>();
    if (root == null)
      return res;
    q.offer(root);
    while (!q.isEmpty()) {
      List<Integer> list = new LinkedList<Integer>();
      int levelNum = q.size();

      for (int i = 0; i < levelNum; i++) {
        if (q.peek().left != null)
          q.offer(q.peek().left);
        if (q.peek().right != null)
          q.offer(q.peek().right);
        list.add(q.poll().val);
      }
      res.add(0, list);
    }
    return res;

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