package Circular_Linked_List;

public class Circular_Linked_List
{

    Node head;
    Node tail;


    class Node{
        int value;
        Node next;
    }

    void startInsert(int val){
        Node node = new Node();
        node.value = val;

        if(head==null){
            head=node;
            tail=node;
        }

        tail.next = node;
        node.next=head;
        head=node;
    }

//    IMP WHY WE USE DO WHILE LOOP
    void display(){
        Node temp = head;

        do {
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }while (temp!=head);
        System.out.println("Head");
    }

    int deleteFromFront()
    {
        int x = head.value;
        tail.next = head.next;
        head=head.next;

        return x;
    }

    int deleteFromBack(){
        int x = tail.value;
        Node temp = head;

        do{
            if(temp.next==tail)
                break;
            temp = temp.next;
        }while (temp!=head);

        temp.next=tail.next;
        tail=temp;

        return x;
    }

    int deleteByValue(int val)
    {
        if(head.value==val) {
            deleteFromFront();
            return val;
        }
        if(tail.value==val)
        {
            deleteFromBack();
            return val;
        }

        Node temp = head;

        do{
            if(temp.next.value==val)
                break;
            temp=temp.next;
        }while(temp!=head);

        temp.next=temp.next.next;

        return val;

//        return val;
    }

}
