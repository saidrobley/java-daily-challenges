/* 
Find the total sum of all root-to-leaf numbers.
*/
public class SumRootToLeaf {
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        getSum(root, 0);
        return sum;
    }

    public void getSum(TreeNode root, int value) {
        value = root.val + 10 * value;
        if (root.left == null && root.right == null) {
            sum += value;
        }
        if (root.left != null) {
            getSum(root.left, value);
        }
        if (root.right != null) {
            getSum(root.right, value);
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