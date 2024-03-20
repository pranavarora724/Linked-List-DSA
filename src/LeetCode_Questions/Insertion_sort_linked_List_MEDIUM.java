package LeetCode_Questions;

public class Insertion_sort_linked_List_MEDIUM
{
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode insertionSortList(ListNode head)
    {
        ListNode prev = head;
        ListNode temp = head.next;
        int maxInd = 1;

        while(temp!=null)
        {
            if(temp.val>=prev.val)
            {
                temp = temp.next;
                prev = prev.next;
                maxInd++;
            }
            else{
                ListNode back = null;
                ListNode pres = head;

                ListNode newNode = new ListNode();
                newNode.val = temp.val;

                int count = 1;
                while(back!=temp)
                {
                    if(temp.val<pres.val)
                    {
                        if(count == 1)
                        {
                            newNode.next = head;
                            head = newNode;
                            break;
                        }
                        newNode.next  = back.next;
                        back.next = newNode;
                        break;
                    }
                    back = pres;
                    pres = pres.next;
                    count++;
                }
            }
        }
        return head;
    }

   public void insertAtPos(ListNode head , int pos , int val)
   {
       ListNode newNode = new ListNode();
       newNode.val = val;
       newNode.next = null;
       if(pos == 1)
       {
          newNode.next = head;
          head = newNode;
       }
       else{
           ListNode demo = getNode(head , pos -1);
           newNode.next = demo.next;
           demo.next = newNode;
       }
   }

   public ListNode getNode(ListNode head , int index)
   {
       ListNode demo = head;

       for(int i=1;i<index;i++)
       {
           demo = demo.next;
       }
       return demo;
   }
}
