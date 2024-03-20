package LeetCode_Questions;

public class Flatten_Multi_Level_Linked_List_MEDIUM
{
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };

    public Node flatten(Node head)
    {
        Node head2 = new Node();
        Node temp1 = head2;

        travel(temp1 , head);
        return head2.next;
    }

    public void travel(Node temp1 , Node temp2)
    {
        if(temp2 == null)
            return;

        if(temp2.val!=-1)
        {
            Node newNode = new Node();
            newNode.val = temp2.val;
            newNode.prev = temp1;
            newNode.child = null;
            newNode.next = null;

            temp1.next = newNode;
            temp1 = newNode;
        }

        int x = temp2.val;
        temp2.val = -1;

        if(temp2!=null &&  temp2.child!=null)
        {
            travel(temp1 , temp2.child);
        }

        if(temp2!=null && temp2.next!=null)
        {
            travel(temp1 , temp2.next);
        }
        temp2.val = x;
        return;
    }
}
