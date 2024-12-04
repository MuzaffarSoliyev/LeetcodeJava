package arraystest;

import arrays.ListNode;
import arrays.NextGreaterNodeInLinkedList;
import org.junit.Before;
import org.junit.Test;

public class NextGreaterNodeInLinkedListTest {
    private NextGreaterNodeInLinkedList nextGreaterNodeInLinkedList;

    @Before
    public void createSolverObject() {
        nextGreaterNodeInLinkedList = new NextGreaterNodeInLinkedList();
    }

    @Test
    public void test1() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(5);

        for (int i: nextGreaterNodeInLinkedList.nextLargerNodes(head)){
            System.out.print(i + " ");
        }
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(7);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);

        for (int i: nextGreaterNodeInLinkedList.nextLargerNodes(head)){
            System.out.print(i + " ");
        }
    }
}
