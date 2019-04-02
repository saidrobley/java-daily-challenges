import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*  
Given a binary tree, return the preorder traversal of its nodes' values.

Example:
Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
Follow up: Recursive solution is trivial, could you do it iteratively?
*/
public class BinaryTreePreorderTraversal {

  public List<Integer> preorderTraversal(TreeNode root) {
    // return preOrderTraversalRecursive(root);
    return preOrderTraversalIterative(root);
  }

  // Recursive solution
  List<Integer> list = new ArrayList<>();

  public List<Integer> preOrderTraversalRecursive(TreeNode root) {
    if (root == null)
      return list;
    list.add(root.val);
    preOrderTraversalRecursive(root.left);
    preOrderTraversalRecursive(root.right);
    return list;
  }

  // Iterative solution
  public List<Integer> preOrderTraversalIterative(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode curr = stack.pop();
      if (curr != null) {
        list.add(curr.val);
        if (curr.right != null)
          stack.push(curr.right);
        if (curr.left != null)
          stack.push(curr.left);
      }
    }
    return list;
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