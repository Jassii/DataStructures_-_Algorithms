/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        //first find the length of both the linked list.
        int c1=0;
        int c2=0;
        
        
        //two pointer method
        ListNode temp1=headA;
        ListNode temp2=headB;
        
        //length of the first linked list
        while(temp1!=null)
        {
            c1++;
            temp1=temp1.next;
        }
        //length of the second linked list
        while(temp2!=null)
        {
            c2++;
            temp2=temp2.next;
        }
        
        //difference between both the linked lists..
        int dif=Math.abs(c1-c2); //difference of the size of both the linked list.
        
        //if size of the first linked list is more than the second linked list..
        if(c1>c2)
        {
            for(int i=1;i<=dif;i++)
            {
                headA = headA.next;
            }
        }
        //vice-versa
        else if(c2>c1)
        {
            for(int i=1;i<=dif;i++)
            {
                headB = headB.next;
            }
        }
        
        //after this its time to compare.
        temp1=headA;
        temp2=headB;
        
        while(temp1!=temp2 && (temp1!=null || temp2!=null))
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        //if node matches..and null not achieved..
        if(temp1==temp2)
        {
            return temp1;
        }
        
        //means that null is achieved and no matching node is there..
        return null;
    }
}
