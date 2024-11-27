package arraystest;

import arrays.ListNode;
import arrays.ReorderList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReorderListTest {
    private ReorderList reorderList;

    @Before
    public void createSolverObject() {
        reorderList = new ReorderList();
    }

    @Test
    public void preMiddleTest1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode preMid = reorderList.preMiddle(head);
        Assert.assertEquals(2, preMid.val);
    }

    @Test
    public void preMiddleTest2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode preMid = reorderList.preMiddle(head);
        Assert.assertEquals(2, preMid.val);
    }

    @Test
    public void preMiddleTest3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode preMid = reorderList.preMiddle(head);
        Assert.assertEquals(1, preMid.val);
    }

    @Test
    public void reverseTest1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode reverseCorrect = new ListNode(2);
        reverseCorrect.next = new ListNode(1);
        ListNode reverse = reorderList.reverse(head);
        while (reverseCorrect != null) {
            Assert.assertEquals(reverseCorrect.val, reverse.val);
            reverseCorrect = reverseCorrect.next;
            reverse = reverse.next;
        }
    }

    @Test
    public void reverseTest2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode reverseCorrect = new ListNode(3);
        reverseCorrect.next = new ListNode(2);
        reverseCorrect.next.next = new ListNode(1);
        ListNode reverse = reorderList.reverse(head);
        while (reverseCorrect != null) {
            Assert.assertEquals(reverseCorrect.val, reverse.val);
            reverseCorrect = reverseCorrect.next;
            reverse = reverse.next;
        }
    }

    @Test
    public void reorderListTest1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode reorderedCorrect = new ListNode(1);
        reorderedCorrect.next = new ListNode(6);
        reorderedCorrect.next.next = new ListNode(2);
        reorderedCorrect.next.next.next = new ListNode(5);
        reorderedCorrect.next.next.next.next = new ListNode(3);
        reorderedCorrect.next.next.next.next.next = new ListNode(4);
        reorderList.reorderList(head);
        while (head != null) {
            Assert.assertEquals(reorderedCorrect.val, head.val);
            reorderedCorrect = reorderedCorrect.next;
            head = head.next;
        }
    }

    @Test
    public void reorderListTest2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reorderedCorrect = new ListNode(1);
        reorderedCorrect.next = new ListNode(5);
        reorderedCorrect.next.next = new ListNode(2);
        reorderedCorrect.next.next.next = new ListNode(4);
        reorderedCorrect.next.next.next.next = new ListNode(3);
        reorderList.reorderList(head);
        while (head != null) {
            Assert.assertEquals(reorderedCorrect.val, head.val);
            reorderedCorrect = reorderedCorrect.next;
            head = head.next;
        }
    }
}
