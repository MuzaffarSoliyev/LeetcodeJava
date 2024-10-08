package arraystest;

import arrays.ListNode;
import arrays.MergeNodesInBetweenZeros;
import org.junit.Before;
import org.junit.Test;

public class MergeNodesInBetweenZerosTest {
    private MergeNodesInBetweenZeros mergeNodesInBetweenZeros;

    @Before
    public void createSolverObject() {
        mergeNodesInBetweenZeros = new MergeNodesInBetweenZeros();
    }

    @Test
    public void test1() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(0);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(5);
        ListNode l7 = new ListNode(2);
        ListNode l8 = new ListNode(0);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        ListNode result = mergeNodesInBetweenZeros.mergeNodes2(l1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
