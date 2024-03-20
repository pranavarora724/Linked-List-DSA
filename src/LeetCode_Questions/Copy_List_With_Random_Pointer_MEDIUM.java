package LeetCode_Questions;

public class Copy_List_With_Random_Pointer_MEDIUM
{
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
//        Node head2 = new Node(0);
        Node temp2 ;
        Node temp1 = head;

        while(temp1!=null)
        {
            Node newNode = new Node(temp1.val);
            newNode.next = temp1.next;
            temp1.next = newNode;

            temp1=temp1.next;
        }
        temp1 = head;
        temp2 = head.next;

        while(temp1!=null)
        {
            if(temp1.random == null)
                temp2.random = null;

            else{
                temp2.random = temp1.random.next;
            }
            temp1=temp1.next.next;
            if(temp2.next!=null)
                temp2 = temp2.next.next;
        }
        Node head2 = head.next;
        temp1 = head;
        temp2 = head.next;

//        while(temp1!=null)
//        {
//          temp2.next = temp2.next.next;
//
//            temp1=temp1.next.next;
//            if(temp2.next!=null)
//                temp2 = temp2.next.next;
//        }

        while(temp2!=null)
        {
            if(temp1 !=null && temp1.next!=null)
            temp1.next = temp1.next.next;

            if(temp2!=null && temp2.next!=null)
            temp2.next = temp2.next.next;

            temp1 = temp1.next;
            temp2=temp2.next;

        }
//        while( temp2!=null && temp2.next!=null)
//        {
//            if(temp1!=null && temp1.next!=null)
//            {
//                temp1.next = temp1.next.next;
//                temp1=temp1.next;
//
//                if(temp1.next.next==null)
//                    temp1.next = null;
//            }
//
//            if(temp2!=null && temp2.next!=null)
//                temp2.next = temp2.next.next;
//
//            if(temp2!=null && temp2.next!=null)
//                temp2 = temp2.next;
//            System.out.println("ThirdLoop");
//        }
        return head2;
    }
}
