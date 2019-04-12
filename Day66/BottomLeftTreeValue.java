import java.util.*;

/* 
Given a binary tree, find the leftmost value in the last row of the tree.

Example 1:
Input:

    2
   / \
  1   3

Output:
1
*/
public class BottomLeftTreeValue {
  public int findBottomLeftValue(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    List<Integer> list = new ArrayList<>();

    q.offer(root);
    while (!q.isEmpty()) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        TreeNode n = q.poll();
        if (i == 0) {
          list.add(n.val);
        }
        if (n.left != null) {
          q.offer(n.left);
        }
        if (n.right != null) {
          q.offer(n.right);
        }

      }

    }

    return list.get(list.size() - 1);
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