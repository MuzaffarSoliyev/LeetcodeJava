package arraystest;

import arrays.ListNode;
import arrays.MergeKSortedLists;
import org.junit.Before;
import org.junit.Test;

public class MergeKSortedListsTest {
    private MergeKSortedLists mergeKSortedLists;

    @Before
    public void createSolverObject() {
        mergeKSortedLists = new MergeKSortedLists();
    }

    @Test
    public void test1() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = new ListNode[]{l1, l2, l3};

        ListNode merged = mergeKSortedLists.mergeKLists(lists);

        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}
