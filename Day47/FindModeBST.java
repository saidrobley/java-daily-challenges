import java.util.*;

/* 
Given a binary search tree (BST) with duplicates, 
find all the mode(s) (the most frequently occurred element) 
in the given BST.
For example:
Given BST [1,null,2,2],

   1
    \
     2
    /
   2
 
return [2]
*/
public class FindModeBST {
  private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  private int max = 0;

  public int[] findMode(TreeNode root) {

    if (root == null) {
      return new int[0];
    }

    helper(root);

    List<Integer> list = new ArrayList<>();
    for (int key : map.keySet()) {
      if (map.get(key) == max)
        list.add(key);
    }

    int[] res = new int[list.size()];
    for (int i = 0; i < res.length; i++)
      res[i] = list.get(i);
    return res;
  }

  public void helper(TreeNode node) {
    map.put(node.val, map.getOrDefault(node.val, 0) + 1);
    max = Math.max(map.get(node.val), max);
    if (node.left != null) {
      helper(node.left);
    }

    if (node.right != null) {
      helper(node.right);
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