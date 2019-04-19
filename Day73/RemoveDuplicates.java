/* 
Given a sorted linked list, delete all nodes that have duplicate numbers, 
leaving only distinct numbers from the original list.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5
*/
public class RemoveDuplicates {
  public ListNode deleteDuplicates(ListNode head) {

    ListNode dummy = new ListNode(-1);
    ListNode curr = head;
    ListNode prev = dummy;
    dummy.next = head;

    while (curr != null) {
      // skip the duplicates until the last one
      while (curr.next != null && curr.val == curr.next.val) {
        curr = curr.next;
      }
      // if there are no duplicates
      if (prev.next == curr) {
        prev = curr;

      } else {
        prev.next = curr.next;

      }
      curr = curr.next;
    }
    return dummy.next;
  }

  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}