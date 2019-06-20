import java.util.Stack;

/* 
Reverse a linked list from position m to n. Do it in one-pass.

Note: 1 ≤ m ≤ n ≤ length of list.

Example:

Input: 1->2->3->4->5->NULL, m = 2, n = 4
Output: 1->4->3->2->5->NULL
*/
public class ReverseLinkedListTwo {
  public ListNode reverseBetween(ListNode head, int m, int n) {
    ListNode prev = null;
    ListNode temp = head;
    int i = 1;
    int j = n - m;
    while (i != m) {
      prev = temp;
      temp = temp.next;
      i++;
    }
    ListNode n1;
    if (temp == head)
      n1 = head;
    else
      n1 = temp;
    Stack<Integer> stack = new Stack<>();

    while (j >= 0) {
      stack.push(n1.val);
      n1 = n1.next;
      j--;
    }

    // point to the head of the reverse Nodes
    ListNode rev = new ListNode(stack.pop());
    // temperory Nodes
    ListNode revTemp = rev;
    while (!stack.isEmpty()) {
      revTemp.next = new ListNode(stack.pop());
      revTemp = revTemp.next;
    }
    if (temp == head) {
      head = rev;
    } else {
      prev.next = rev;

    }
    revTemp.next = n1;
    return head;

  }

  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}