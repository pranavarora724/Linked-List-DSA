package LeetCode_Questions;

public class Intersection_Of_Linked_List_EASY
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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m = findLength(headA);
        int n = findLength(headB);

        if(m<n)
        {
            int diff = n-m;
            ListNode temp1 = headA;
            ListNode temp2 = getNode(headB , diff+1);

            while(temp1!=null && temp2!=null)
            {
                if(temp1 == temp2)
                    return temp1;

                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return null;
        }
        else{
            int diff = m-n;
            ListNode temp1 = getNode(headA , diff+1);
            ListNode temp2 = headB;

            while(temp1!=null && temp2!=null)
            {
                if(temp1 == temp2)
                    return temp1;

                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return null;
        }
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

    public int findLength(ListNode head)
    {
        ListNode temp = head;
        int size = 1;
        while(temp.next!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }
}
