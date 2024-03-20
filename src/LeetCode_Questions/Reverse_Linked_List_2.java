package LeetCode_Questions;

public class Reverse_Linked_List_2
{

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode reverseBetween(ListNode head, int left, int right)
    {
        ListNode prev =head;
        ListNode pres ;
        ListNode next ;

        ListNode first = head;
        ListNode newHead;
        ListNode newTail;

//        Getting element just before Starting of SUB - LIST
        for(int i=1;i<left-1;i++)
        {
            first = first.next;
        }

        prev=first.next;
        pres= prev.next;
        next=pres.next;

//        Update newHead
        newTail = prev;

//        Now Swapping elements

        for(int i=1;i<=right-left;i++)
        {
            pres.next=prev;
            prev = pres;
            pres = next;

            if(next!=null)
                next = next.next;
        }

//        Update newTail
        newHead = prev;

//        V......IMP..
        //   If left == 1 Then newHead will become the head of entire LIST
        if(left==1)
            head = newHead;

        first.next = newHead;
        newTail.next = pres;

        return head;
    }

}
