import java.lang.StringBuilder;

/* 
You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.

Example 1:
Input: Binary tree: [1,2,3,4]
       1
     /   \
    2     3
   /    
  4     

Output: "1(2(4))(3)"
*/
public class StringFromBinaryTree {
  public String tree2str(TreeNode t) {
    if (t == null)
      return "";

    StringBuilder sb = new StringBuilder();
    tree2str(t, sb);
    return sb.toString();
  }

  private void tree2str(TreeNode t, StringBuilder sb) {
    if (t == null) {
      return;
    }
    sb.append(t.val);
    // if both are null return
    if (t.left == null && t.right == null) {
      return;
    }
    sb.append("(");
    tree2str(t.left, sb);
    sb.append(")");

    if (t.right != null) {
      sb.append("(");
      tree2str(t.right, sb);
      sb.append(")");
    }

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