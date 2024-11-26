package arraystest;

import arrays.PalindromeLinkedList;
import org.junit.Assert;
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
  public void testFindMiddleElement1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(1);
    ListNode mid = palindromeLinkedList.findMiddleElement(head);
    Assert.assertEquals(2, mid.val);
    Assert.assertEquals(1, mid.next.val);
  }

  @Test
  public void testFindMiddleElement2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(1);
    ListNode mid = palindromeLinkedList.findMiddleElement(head);
    Assert.assertEquals(3, mid.val);
  }

  @Test
  public void testFindMiddleElement3() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    ListNode mid = palindromeLinkedList.findMiddleElement(head);
    Assert.assertEquals(2, mid.val);
  }

  @Test
  public void testReverseLinkedList() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);

    ListNode headReversed = new ListNode(4);
    headReversed.next = new ListNode(3);
    headReversed.next.next = new ListNode(2);
    headReversed.next.next.next = new ListNode(1);

    ListNode reversed = palindromeLinkedList.reverse(head);
    while (reversed != null) {
      Assert.assertEquals(headReversed.val, reversed.val);
      reversed = reversed.next;
      headReversed = headReversed.next;
    }
  }

  @Test
  public void testIsPalindrome1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(1);
    Assert.assertTrue(palindromeLinkedList.isPalindrome(head));
  }

  @Test
  public void testIsPalindrome2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(1);
    Assert.assertTrue(palindromeLinkedList.isPalindrome(head));
  }

  @Test
  public void testIsPalindrome3() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(1);
    Assert.assertFalse(palindromeLinkedList.isPalindrome(head));
  }

  @Test
  public void testIsPalindrome4() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    Assert.assertFalse(palindromeLinkedList.isPalindrome(head));
  }

}
