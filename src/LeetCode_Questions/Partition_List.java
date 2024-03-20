package LeetCode_Questions;

public class Partition_List
{
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val,ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode();
        ListNode head2 = new ListNode();

        ListNode temp1 = head1;
        ListNode temp2 = head2;

        ListNode temp3 = head;

        while(temp3!=null)
        {
            ListNode newNode = new ListNode(temp3.val);
            newNode.next=null;

            if(temp3.val<x)
            {
                temp1.next = newNode;
                temp1 = temp1.next;
            }
            else{
                temp2.next = newNode;
                temp2 = temp2.next;
            }

            temp3 = temp3.next;
        }
        temp1.next = head2.next;

        return head1;
    }
}
