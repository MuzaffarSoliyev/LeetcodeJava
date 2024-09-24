package arraystest;

import arrays.PalindromeLinkedList;
import org.junit.Before;
import org.junit.Test;
import arrays.ListNode;

public class PalindromeLinkedListTest {
    private PalindromeLinkedList palindromeLinkedList;

    @Before
    public void createSolverObject() {
        palindromeLinkedList = new PalindromeLinkedList();
    }

    @Test
    public void testIsPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        palindromeLinkedList.isPalindrome(head);

    }

}
