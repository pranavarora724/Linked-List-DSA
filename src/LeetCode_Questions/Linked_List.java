package LeetCode_Questions;

public class Linked_List
{
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
  }

  ListNode reverse(ListNode head)
  {
      ListNode prev = null;
      ListNode pres = head;
      ListNode next = pres.next;

      while(pres!=null)
      {
          pres.next=prev;

          pres=prev;
          next=pres;
          if(next!=null)
          next=next.next;
      }
      return prev;
  }
}
