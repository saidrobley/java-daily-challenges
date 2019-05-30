import java.util.*;

/* 
Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
Example 1:
Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
*/
public class AverageLevelsBT {
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    while (!q.isEmpty()) {
      double size = q.size();
      double sum = 0;
      for (int i = 0; i < size; i++) {
        TreeNode temp = q.poll();
        sum += temp.val;
        if (temp.left != null)
          q.offer(temp.left);
        if (temp.right != null)
          q.offer(temp.right);

      }
      double average = sum / size;
      res.add(average);
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