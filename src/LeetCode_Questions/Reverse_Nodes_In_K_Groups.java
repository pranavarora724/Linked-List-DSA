package LeetCode_Questions;

public class Reverse_Nodes_In_K_Groups
{

      public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)
            return null;

        if(head.next==null)
            return head;

        ListNode newTail = head;
        ListNode newHead;
        int l = getLength(head);

        head = getNode(head ,k);
        int n=l/k;

        for(int i=1;i<=n;i++)
        {
            ListNode node1 = getNode(newTail , k+1);
            ListNode node2 = getNode(newTail , 2*k);


            newHead = reverse(newTail , k);

            //    if(i==1)
            //    head = newHead;

            if(i==n)
            {
                newTail.next = node1;
            }
            else{

                newTail.next = node2;
            }
            newTail = node1;
        }
        return head;
    }

    public ListNode getNode(ListNode head , int index)
    {
        ListNode temp = head;
        for(int i=1;i<index;i++)
        {
            if(temp==null)
                return null;

            temp = temp.next;
        }
        return temp;
    }

    public int getLength(ListNode head)
    {
        ListNode temp = head;
        int length=1;

        while(temp.next!=null)
        {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public ListNode reverse(ListNode head , int k)
    {
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;

        for(int i=1;i<=k;i++)
        {
            pres.next = prev;

            prev = pres;
            pres=next;

            if(next!=null)
                next=next.next;
        }

        return pres;
    }
}

