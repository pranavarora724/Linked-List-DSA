package LeetCode_Questions;

public class Reorder_List
{
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public void reorderList(ListNode head) {
          ListNode head1 = head;
          ListNode head2 = middle(head1);

          head2 = reverse(head2);

          while(head1!=null && head2!=null)
          {
              if(head1==head2)
              {
                  head1.next=null;
                  head1=null;
              }
              else{
                  ListNode temp1 = head1.next;
                  ListNode temp2 = head2.next;

                  head1.next= head2;
                  head2.next = temp1;
                  head1=temp1;
                  head2=temp2;

                  temp1=temp1.next;
                  temp2=temp2.next;
              }
          }
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;

        while(pres!=null)
        {
            pres.next = prev;
            prev = pres;
            pres = next;

            if(next!=null)
                next = next.next;
        }

        return  prev;
    }

    public ListNode middle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null)
        {
            fast= fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
