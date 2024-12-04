package arraystest;

import arrays.ListNode;
import arrays.SwapNodesInPairs;
import org.junit.Before;
import org.junit.Test;

public class SwapNodesInPairsTest {
    private SwapNodesInPairs swapNodesInPairs;

    @Before
    public void createSolverObject(){
        swapNodesInPairs = new SwapNodesInPairs();
    }

    @Test
    public void test() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode result = swapNodesInPairs.swapPairs(head);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
