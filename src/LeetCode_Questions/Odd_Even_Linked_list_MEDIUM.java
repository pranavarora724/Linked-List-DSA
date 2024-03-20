package LeetCode_Questions;

import java.util.ArrayList;

public class Odd_Even_Linked_list_MEDIUM
{
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        ListNode even = head.next;
        ListNode temp = odd;

        ArrayList<Integer> list = new ArrayList<>();

        while(odd!=null && even!=null)
        {
            temp.val = odd.val;
            list.add(even.val);

            temp = temp.next;
            if(odd.next!=null)
            odd = odd.next.next;

            if(even.next!=null)
            even = even.next.next;


        }
        temp = temp.next;
        for(int i=0;i<list.size();i++)
        {
            temp.val = list.get(i);
            temp = temp.next;
        }
        return head;
    }
}
