package arrays;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode prevHead = head;
        ListNode curr = prevHead;
        while (prevHead != null) {
            prevHead = prevHead.next;
        }
        ListNode newHead = reverse(head);
        while (newHead != null) {
            if (newHead.val != prevHead.val) return false;
            newHead = newHead.next;
            prevHead = prevHead.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
