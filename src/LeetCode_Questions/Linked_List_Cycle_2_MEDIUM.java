package LeetCode_Questions;

public class Linked_List_Cycle_2_MEDIUM
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

    public ListNode detectCycle(ListNode head)
    {
        int length = cycleLength(head);
        ListNode temp1 = head;
        ListNode temp2 = getNode(head,length+1);

        while(temp1!=temp2)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }

    public ListNode getNode(ListNode head , int index)
    {
        ListNode temp = head;

        for(int i=1;i<index;i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    public int cycleLength(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                break;
        }
        if(fast == null || fast.next == null)
            return 0;

        int length = 1;
        do{
            slow = slow.next;
            length++;
        }while(slow != fast);

        return length;
    }

}
