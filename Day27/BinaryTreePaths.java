import java.util.List;
import java.util.ArrayList;

/* 
Given a binary tree, return all root-to-leaf paths.
Note: A leaf is a node with no children.
Example:
Input:
   1
 /   \
2     3
 \
  5
Output: ["1->2->5", "1->3"]
*/
public class BinaryTreePaths {
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> res = new ArrayList<String>();
    helper(root, "", res);
    return res;
  }

  public void helper(TreeNode root, String temp, List<String> res) {
    if (root == null)
      return;
    temp += root.val;
    if (root.left == null && root.right == null) {
      res.add(temp);
      return;
    }
    temp += "->";
    helper(root.left, temp, res);
    helper(root.right, temp, res);
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