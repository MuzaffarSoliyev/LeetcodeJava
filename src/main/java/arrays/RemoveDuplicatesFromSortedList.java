package arrays;

public class RemoveDuplicatesFromSortedList {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode dummy = new ListNode(0, head);
    ListNode cur = dummy.next;
    ListNode pred = dummy.next;
    int uniqueValue;
    if (cur != null) {
      uniqueValue = head.val;
      cur = cur.next;
      while (cur != null) {
        if (cur.val == uniqueValue) {
          pred.next = cur.next;
        } else {
          uniqueValue = cur.val;
          pred = cur;
        }
        cur = cur.next;
      }
    }
    return dummy.next;
  }
}
