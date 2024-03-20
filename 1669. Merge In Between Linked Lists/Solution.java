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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1;
        int count=0;
        while(count<a-1)
        {
            temp1=temp1.next;
            count++;
        }
       ListNode front=temp1;
        ListNode temp2=temp1;
        while(count<b+1)
        {
            temp2=temp2.next;
            count++;
        }
        ListNode first=list2;
        ListNode last=list2;
        while(last.next!=null)
        {
            last=last.next;
        }
       
         last.next=temp2;
           front.next=first;
   return list1;

    }
}
