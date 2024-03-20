package Basics_Making_Custom_Linked_List.Doubly_Linked_List;

public class Doubly_Linked_List
{
    Node head;

    class Node {

        int value;
        Node prev;
        Node next;
    }

    void startInsert(int val)
    {
        Node node = new Node();
        if(head==null)
        {
            node.value=val;
            head=node;
        }
        else{
            node.next=head;
            head.prev=node;
            node.value=val;
            head=node;
        }
    }

    void lastInsert(int val){
        Node node = new Node();
        Node temp = head;


        if(head==null)
        {
            startInsert(val);
            return;
        }

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        node.value=val;
    }

    void insertAtInd(int ind , int val)
    {
        if(ind==0)
        {
            startInsert(val);
            return;
        }
        else{
            Node temp = head;
            Node node = new Node();

            for(int i=1;i<ind;i++)
            {
                temp = temp.next;
            }
            node.next=temp.next;
            (temp.next).prev=node;
            temp.next=node;
            node.prev=temp;
        }
    }

    void display(){
        Node temp = head;

        while(temp!=null)
        {
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    void displayRev(){
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }

        while(temp!=null)
        {
            System.out.print(temp.value+"-->");
            temp=temp.prev;
        }
                System.out.print("START");
    }
}
