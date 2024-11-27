package arrays;

public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode preMid = preMiddle(head);
        ListNode p2 = reverse(preMid.next);
        preMid.next = null;
        ListNode p1 = head;
        while (p2 != null) {
            ListNode p1Next = p1.next;
            p1.next = p2;
            p1 = p2;
            p2 = p1Next;
        }
    }

    public ListNode preMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        ListNode pred = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr;
            curr = curr.next;
            tmp.next = pred;
            pred = tmp;
        }
        return pred;
    }
}
