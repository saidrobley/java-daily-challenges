import java.util.Stack;

/* 
Reverse a singly linked list.
Example:
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
*/
public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
    Stack<ListNode> stack = new Stack<>();
    while (head != null) {
      stack.push(head);
      head = head.next;
    }
    ListNode dummy = new ListNode(-1);
    head = dummy;
    while (!stack.isEmpty()) {
      ListNode curr = stack.pop();
      head.next = new ListNode(curr.val);
      head = head.next;
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