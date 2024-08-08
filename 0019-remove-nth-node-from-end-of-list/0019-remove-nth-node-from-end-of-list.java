class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
       ListNode fast = head;  
       int i; 
       for(i=1 ; i<=n ; i++)
       {
        fast = fast.next;
       }  
       if(fast==null)
       {
        return head.next;
       }
       ListNode slow = head; 
       while(fast.next!=null)
       {
        slow  =slow.next; 
        fast = fast.next;
       }
       slow.next = slow.next.next; 
       return head;
    }
}