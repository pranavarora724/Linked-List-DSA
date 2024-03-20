package LeetCode_Questions;

public class Remove_Duplicates_From_List_2_MEDIUM
{
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode deleteDuplicates(ListNode head)
    {
        if(head == null)
            return null;

        if(head.next==null)
            return head;

        ListNode head2 = new ListNode();
        ListNode temp = head2;

        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        while(pres!=null)
        {
            while((prev!=null && prev.val!=pres.val) || (next!=null && pres.val!=next.val))
            {
                prev = pres;
                pres = next;
                next=next.next;
            }

            temp.next = pres;
            temp = pres;
        }
        return head2.next;
    }
}
