import java.util.*;

public class LargestValues {
  public List<Integer> largestValues(TreeNode root) {
    // create list
    List<Integer> res = new ArrayList<>();
    // create Queue
    Queue<TreeNode> queue = new LinkedList<>();
    if (root == null) {
      return res;
    }
    // add root to the queue
    queue.offer(root);

    while (!queue.isEmpty()) {
      // get the size of the queue
      int size = queue.size();

      int max = Integer.MIN_VALUE;
      for (int i = 0; i < size; i++) {

        TreeNode tmp = queue.poll();

        if (max < tmp.val) {
          max = tmp.val;
        }
        if (tmp.left != null) {
          queue.offer(tmp.left);
        }
        if (tmp.right != null) {
          queue.offer(tmp.right);
        }
      }
      res.add(max);
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