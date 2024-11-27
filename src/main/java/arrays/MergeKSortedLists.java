package arrays;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (true){
            ListNode min = minElement(lists);
            if (min == null){
                break;
            }
            current.next = min;
            current = current.next;
        }
        return dummy.next;
    }

    public ListNode minElement(ListNode[] lists) {

        ListNode min = new ListNode(Integer.MAX_VALUE);
        int minIndex = 0;
        boolean changed = false;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null && lists[i].val < min.val) {
                min.val = lists[i].val;
                minIndex = i;
                changed = true;
            }
        }
        if (changed) {
            lists[minIndex] = lists[minIndex].next;
            return min;
        }else {
            return null;
        }
    }
}
