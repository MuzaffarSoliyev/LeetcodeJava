package arraystest;

import arrays.InsertGreatestCommonDivisorsInLinkedList;
import arrays.ListNode;
import org.junit.Before;
import org.junit.Test;

public class InsertGreatestCommonDivisorsInLinkedListTest {
    private InsertGreatestCommonDivisorsInLinkedList insertGreatestCommonDivisorsInLinkedList;

    @Before
    public void createSolverObject() {
        insertGreatestCommonDivisorsInLinkedList = new InsertGreatestCommonDivisorsInLinkedList();
    }

    @Test
    public void test1() {
        ListNode l1 = new ListNode(18);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(10);
        ListNode l4 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListNode result = insertGreatestCommonDivisorsInLinkedList.insertGreatestCommonDivisors(l1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    public void test2() {
        System.out.printf("" + insertGreatestCommonDivisorsInLinkedList.greatestCommonDivisor(6, 10));
    }

    @Test
    public void test3() {
        ListNode l1 = new ListNode(7);

        ListNode result = insertGreatestCommonDivisorsInLinkedList.insertGreatestCommonDivisors(l1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
