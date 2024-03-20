package LeetCode_Questions;

public class Merge_In_Between_Lined_Lists_MEDIUM
{
    public class ListNode {
        int val;
      ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;

        ListNode tail2 = head2;
        while(tail2.next!=null)
        {
            tail2 = tail2.next;
        }
        ListNode temp1 = getNode(head1 , a-1);
        ListNode temp2 = getNode(head2 , b+1);

        if(temp1!=null)
            temp1.next = head2;
        tail2.next = temp2;

        if(a == 0)
        {
            return head2;
        }
        else{
            return head1;
        }
    }

    public ListNode getNode(ListNode head , int ind)
    {
        ListNode demo = head;
        if(ind == -1)
            return null;

        for(int i=0;i<ind;i++)
        {
            if(demo == null)
            return null;

            demo = demo.next;
        }
        return demo;
    }
}
