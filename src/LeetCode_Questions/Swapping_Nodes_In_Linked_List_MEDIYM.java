package LeetCode_Questions;

public class Swapping_Nodes_In_Linked_List_MEDIYM
{
      public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode swapNodes(ListNode head, int k)
    {
        int length = getLength(head);
        ListNode node1  = getNode( head , k);
        ListNode node2 = getNode(head , length-k+1);
        ListNode prev1 = getNode(head , k-1);
        ListNode prev2 = getNode(head  , length-k);
        ListNode next1 = node1.next;
        ListNode next2 = node2.next;

        if(node1.next == node2)
        {
            prev1.next = node2;
            node1.next = node2.next;
            node2.next = node1;
        }
        if(node2.next == node1)
        {
            prev2.next = node1;
            node2.next = node1.next;
            node1.next = node2;
        }

        prev1.next = node2;
        prev2.next = node1;
        node1.next = next2;
        node2.next = next1;

        if(k==1)
        {
            head = node2;
        }
        if(k==length)
        {
            head = node1;
        }
        return head;
    }

    public ListNode getNode(ListNode head , int index)
    {
        if(index == 0)
            return null;

        ListNode temp = head;
        for(int i=1;i<index;i++)
        {
            if(temp == null)
                return null;

            temp = temp.next;
            index++;
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
}
