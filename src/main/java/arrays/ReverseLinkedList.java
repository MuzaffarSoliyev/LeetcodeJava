package arrays;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr;
            curr = curr.next;
            tmp.next = prev;
            prev = tmp;
        }
        return prev;
    }
}
