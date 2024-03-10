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
    public ListNode swapPairs(ListNode head) {
         ListNode dummy = new ListNode();
        dummy.next = head;
        swap(dummy);
        return dummy.next;
    }

    private void swap(ListNode node) {
        ListNode first = node.next;
        if (first == null || first.next == null) {
            return; // Terminate recursion if there are no more pairs to swap
        }

        ListNode second = first.next;
        ListNode secondNext = second.next;

        // Swapping
        node.next = second;
        first.next = secondNext;
        second.next = first;

        swap(first); // Recur for the next pair
    }
}
