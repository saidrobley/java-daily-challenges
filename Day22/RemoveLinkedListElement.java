public class RemoveLinkedListElement {
  public ListNode removeElements(ListNode head, int val) {
    if (head == null)
      return null;
    while (head != null) {
      if (head.val == val) {
        head = head.next;
      } else {
        break;
      }
    }
    ListNode temp = head;
    if (temp == null)
      return null;
    while (temp.next != null) {
      if (temp.next.val == val) {
        temp.next = temp.next.next;
      } else {
        temp = temp.next;
      }
    }
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