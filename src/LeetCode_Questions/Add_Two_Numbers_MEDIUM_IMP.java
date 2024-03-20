package LeetCode_Questions;

public class Add_Two_Numbers_MEDIUM_IMP
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        if(l1==null && l2==null)
            return null;

        if(l1 == null )
            return l2;

        if(l2 == null)
            return l1;

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode l3 = new ListNode();
        l3.val = -1;
        l3.next = null;

        // ListNode temp3 = new ListNode();
        ListNode temp3 = l3;
        int carry = 0;
        int x = 0;
        int y = 0;

        int count = 0;

        while(temp1!=null || temp2!=null || carry!=0)
        {
            if(temp1!=null)
                x = temp1.val;

            if(temp2!=null)
                y = temp2.val;

            int newVal = (x+y+carry)%10;
            carry = (x+y+carry)/10;

            ListNode newNode = new ListNode();
            newNode.val = newVal;
            newNode.next = null;

            temp3.next = newNode;
            temp3 = newNode;

            if(count == 0)
            {
                l3 = newNode;
            }
            x=0;
            y=0;
            count++;
            if(temp1!=null)
                temp1 = temp1.next;
            if(temp2!=null)
                temp2 = temp2.next;

        }


        return l3;

    }
}
