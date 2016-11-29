/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) { return l2; }
        if (l2 == null) { return l1; }
        
        ListNode head = new ListNode(0);
        ListNode p = head;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int num = l1.val + l2.val + carry;
            ListNode node = new ListNode(num % 10);
            carry = num / 10;
            p.next = node;
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while (l1 != null) {
            int num = l1.val + carry;
            ListNode node = new ListNode(num % 10);
            carry = num / 10;
            p.next = node;
            p = p.next;
            l1 = l1.next;
        }
        
        while (l2 != null) {
            int num = l2.val + carry;
            ListNode node = new ListNode(num % 10);
            carry = num / 10;
            p.next = node;
            p = p.next;
            l2 = l2.next;
        }
        
        if (carry != 0) {
            ListNode node = new ListNode(carry);
            p.next = node;
        }
        
        return head.next;
    }
}