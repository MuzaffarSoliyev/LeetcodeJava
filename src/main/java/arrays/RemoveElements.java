package arrays;




public class RemoveElements {
  public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(0, head);
    ListNode cur = head;
    ListNode prev = dummy;
    while (cur != null) {
      if (cur.val == val) {
        prev.next = cur.next;
      } else {
        prev = cur;
      }
      cur = cur.next;
    }
    return dummy.next;
  }
}
