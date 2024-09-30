package arrays;

public class InsertGreatestCommonDivisorsInLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            curr.next = new ListNode(greatestCommonDivisor(curr.val, curr.next.val), curr.next);
            curr = curr.next.next;
        }
        return dummy.next;
    }

    public int greatestCommonDivisor(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
}
