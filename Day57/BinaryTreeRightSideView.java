import java.util.*;

/* 
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes 
you can see ordered from top to bottom.

Example:

Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
*/
public class BinaryTreeRightSideView {
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    helper(root, list, 0);
    return list;
  }

  public void helper(TreeNode root, List<Integer> list, int index) {
    if (root == null)
      return;
    if (list.size() == index) {
      list.add(root.val);
    }
    helper(root.right, list, index + 1);
    helper(root.left, list, index + 1);
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