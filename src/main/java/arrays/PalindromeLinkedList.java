package arrays;

public class PalindromeLinkedList {
  public boolean isPalindrome(ListNode head) {
    ListNode midElement = findMiddleElement(head);
    ListNode reversed = reverse(midElement);
    ListNode curr = head;
    while (reversed != null) {
      if (reversed.val != curr.val){
        return false;
      }
      reversed = reversed.next;
      curr = curr.next;
    }
    return true;
  }

  public ListNode findMiddleElement(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode tmp = curr;
      curr = curr.next;
      tmp.next = prev;
      prev = tmp;
    }
    return prev;
  }

}
