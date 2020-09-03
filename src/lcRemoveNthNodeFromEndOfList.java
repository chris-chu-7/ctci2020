class Solution {
    
 
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = n;
        ListNode first = new ListNode(0);
        ListNode third = first;
        ListNode second = first;
        first.next = head;
        for(int i = 0; i <= n; i++){
            first = first.next;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return third.next;
    }


} 