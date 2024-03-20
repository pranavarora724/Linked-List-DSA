package LeetCode_Questions;

public class Rotate_Linked_List
{
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k)
    {
        int l = getLength(head);
        k=k%l;
        ListNode newTail = getNode(head , l);
        ListNode newLast = getNode(head , l-k);
        ListNode newHead = getNode(head , l-k+1);

        newTail.next = head;
        newLast.next = null;
        head = newHead;

        return head;
    }

    public int getLength(ListNode head){
        ListNode temp = head;
        int length=1;

        while(temp.next!=null){
            length++;
        }

        return length;
    }
    public ListNode getNode(ListNode head ,int index)
    {
        ListNode  temp = head;
        for(int i=1;i<index;i++)
        {
            temp = temp.next;
        }
        return temp;
    }
}
