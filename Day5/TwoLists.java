public class TwoLists {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);
    ListNode mergeList = mergeTwoLists(l1, l2);
    while (mergeList != null) {
      System.out.println(mergeList.val);
      mergeList = mergeList.next;
    }
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode l3 = new ListNode(0);
    ListNode curr = l3;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        curr.next = l1;
        l1 = l1.next;

      } else {
        curr.next = l2;
        l2 = l2.next;

      }
      curr = curr.next;
    }
    if (l1 != null) {
      curr.next = l1;
    }
    if (l2 != null) {
      curr.next = l2;
    }
    return l3.next;

  }
}