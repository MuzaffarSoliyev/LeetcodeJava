package arraystest;

import arrays.IntersectionOfTwoLinkedLists;
import arrays.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionOfTwoLinkedListsTest {
    private IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists;

    @Before
    public void createSolverObject() {
        intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
    }


    @Test
    public void testGetIntersectionNode1() {
        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(8);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(1);
        head2.next.next.next = new ListNode(8);
        head2.next.next.next.next = new ListNode(4);
        head2.next.next.next.next.next = new ListNode(5);

        ListNode intersection = intersectionOfTwoLinkedLists.getIntersectionNode(head1, head2);
        Assert.assertEquals(8, intersection.val);
    }

    @Test
    public void testGetIntersectionNode2() {
        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(8);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(1);
        head2.next.next.next = new ListNode(8);
        head2.next.next.next.next = new ListNode(4);
        head2.next.next.next.next.next = new ListNode(5);

        ListNode intersection = intersectionOfTwoLinkedLists.getIntersectionNode(head1, head2);
        Assert.assertEquals(8, intersection.val);
    }
}
