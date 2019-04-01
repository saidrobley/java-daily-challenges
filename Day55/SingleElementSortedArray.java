import java.util.Stack;

/* 
Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.
*/
public class SingleElementSortedArray {
  public int singleNonDuplicate(int[] nums) {
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(nums[0]);
    for (int i = 1; i < nums.length; i++) {
      int num = nums[i];
      if (stack.contains(num)) {
        stack.pop();
      } else {
        stack.push(num);
      }
    }
    return stack.pop();
  }
}