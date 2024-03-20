package LeetCode_Questions;

public class Swap_Nodes_In_Pairs_MEDIUM
{
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;

        if(head.next == null)
            return head;

        ListNode temp1 = head;
        ListNode temp2 = head.next;
        ListNode node1;
        ListNode node2;

        head = temp2;

        while(temp1!=null && temp2!=null)
        {
             node1 = temp2.next;

            if(temp2.next==null)
                node2 = null;
            else
            node2 = temp2.next.next;

            if(node2!=null)
                temp1.next = node2;
            else{
                temp1.next = node1;
            }
            temp2.next = temp1;

            temp1 = node1;
            temp2 = node2;

            if(node1!=null && node1.next!=null)
                node1 = node1.next.next;
            if(node2!=null && node2.next!=null)
                node2 = node2.next.next;
        }
        return head;
    }
}
