import java.util.PriorityQueue;

/* 
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
*/
public class MergeKSortedList {
  public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for (ListNode list : lists) {
      while (list != null) {
        minHeap.add(list.val);
        list = list.next;
      }
    }
    ListNode dummy = new ListNode(0);
    ListNode head = dummy;
    while (!minHeap.isEmpty()) {
      dummy.next = new ListNode(minHeap.remove());
      dummy = dummy.next;
    }
    return head.next;
  }

  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}