/*
Given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

class Solution {

  public static void main(String[] arg) {
    int[] a = { 2, 4, 3 };
    int[] b = { 5, 6, 4 };
    ListNode l1 = getListNode(a);
    ListNode l2 = getListNode(b);

    ListNode test = addTwoNumbers(l1, l2);
    while (test != null) {
      System.out.print(test.val + " ");
      test = test.next;

    }
    System.out.println();
  }

  public static ListNode getListNode(int[] a) {
    ListNode l1 = new ListNode(a[0]);
    ListNode head = l1;
    for (int i = 1; i < a.length; i++) {
      l1.next = new ListNode(a[i]);
      l1 = l1.next;

    }
    return head;
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    int carry = 0;
    ListNode p = l1;
    ListNode q = l2;
    ListNode curr = dummyHead;
    while (p != null || q != null) {
      int x = (p != null) ? p.val : 0;
      int y = (q != null) ? q.val : 0;
      int sum = x + y + carry;
      carry = sum / 10;
      curr.next = new ListNode(sum % 10);
      curr = curr.next;
      if (p != null) {
        p = p.next;
      }
      if (q != null) {
        q = q.next;
      }
    }
    if (carry > 0) {
      curr.next = new ListNode(carry);
    }
    return dummyHead.next;
  }

}
