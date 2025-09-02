/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case: if list is empty OR only one node, return it
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Reverse rest of the list
        ListNode newHead = reverseList(head.next);

        // Step 2: Reverse the link
        head.next.next = head;  // next node points back to current
        head.next = null;       // break old forward link

        // Step 3: return new head
        return newHead;
    }
}
    