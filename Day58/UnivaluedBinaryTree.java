import java.util.Queue;
import java.util.LinkedList;

/* 
A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.

Example 1:
Input: [1,1,1,1,1,null,1]
Output: true
*/
public class UnivaluedBinaryTree {
  public boolean isUnivalTree(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    while (!q.isEmpty()) {
      TreeNode n = q.poll();
      if (n.val != root.val)
        return false;
      if (n.left != null)
        q.offer(n.left);
      if (n.right != null)
        q.offer(n.right);
    }

    return true;

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