package arrays;

public class NextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr = head;
        ListNode tmp = null;
        boolean found = false;
        int lenght = 0, i = 0;
        while (curr != null) {
            curr = curr.next;
            lenght++;
        }
        int[] result = new int[lenght];
        curr = head;
        while (curr != null) {
            tmp = curr;
            while (tmp != null) {
                if (tmp.val > curr.val) {
                    found = true;
                    result[i] = tmp.val;
                    break;
                }
                tmp = tmp.next;
            }
            if (!found) {
                result[i] = 0;
            }
            curr = curr.next;
            i++;
        }
        return result;
    }
}
