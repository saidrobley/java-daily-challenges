/* 
Given an array where elements are sorted in ascending order, 
convert it to a height balanced BST.
*/
public class SortedArrayToBST {
  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums.length == 0)
      return null;
    int mid = (0 + nums.length) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = helper(nums, 0, mid - 1, root);
    root.right = helper(nums, mid + 1, nums.length - 1, root);
    return root;
  }

  TreeNode helper(int[] nums, int start, int end, TreeNode root) {
    if (start < end) {
      int mid = (start + end) / 2;
      TreeNode cur = new TreeNode(nums[mid]);
      cur.left = helper(nums, start, mid - 1, cur);
      cur.right = helper(nums, mid + 1, end, cur);
      return cur;
    } else if (start == end) {
      return new TreeNode(nums[start]);
    } else {
      return null;
    }
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