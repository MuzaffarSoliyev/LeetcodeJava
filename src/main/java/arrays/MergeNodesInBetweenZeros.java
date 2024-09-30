package arrays;

public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode currDummy = dummy;
        ListNode curr = head;
        int sum = 0;
        while (curr != null) {
            if (curr.val != 0) {
                sum += curr.val;
            } else if (sum != 0) {
                currDummy.next = new ListNode(sum);
                currDummy = currDummy.next;
                sum = 0;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public ListNode mergeNodes2(ListNode head) {
        ListNode tmp = head;
        ListNode prev = head.next;
        ListNode next = head.next;
        int sum;
        while (next != null) {
            if (next.val == 0) {
                sum = 0;
                while (prev.val != 0) {
                    sum += prev.val;
                    prev = prev.next;
                }
                tmp.val = sum;
                tmp.next = next.next;
                tmp = tmp.next;
                prev = prev.next;
            }
            next = next.next;
        }
        return head;
    }
}
