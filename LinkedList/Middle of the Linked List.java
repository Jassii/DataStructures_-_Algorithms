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
class Solution 
{
    
    public ListNode middleNode(ListNode head) 
    {
        
        //very optimized way of finding the middle element.
        ListNode slow=head;
        ListNode fast=head;
        //when the fast node have reached the null then the slow node will be at its middle node
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
