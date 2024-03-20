package Basics_Making_Custom_Linked_List.Single_Linked_List;

public class Single_Linked_List
{

    Node head;
    Node tail;
    int size=0;

//    class of a custom single NODE
    class Node{
        int value;
        Node next;
    }

    public Node returnHead()
    {
        return  head;
    }

//    Insert at start
   public void startInsert(int val)
    {
        size++;
        Node node = new Node();
        node.value=val;
        Node temp = head;

        if(head==null)
        {
            head=node;
            tail=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }

//    Insert Last
    void lastInsert(int val)
    {
        size++;
        Node node = new Node();
        node.value=val;

        if(head==null)
        {
            startInsert(val);
            return;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }

//    Insert at Ind
    void insertAtInd(int ind , int val)
    {
        size++;
        if(ind==0)
        {
            startInsert(val);
            return;
        }
        else{
            Node temp = head;

            for(int i=1;i<ind;i++)
            {
                temp=temp.next;
            }
            if(temp.next==null)
            {
                lastInsert(val);
                return;
            }
            Node node = new Node();
            node.value=val;
            node.next=temp.next;
            temp.next=node;
        }
    }

//    Display function
   public void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }

//    Remove from start
    int startRemove()
    {
        size--;
        int x=head.value;
        if(head.next==null)
        {

            head=null;
            tail=null;
        }
        head=head.next;
        return x;
    }

//    Remove from end
    int endRemove(){
        size--;
        int x = tail.value;
        if(head.next==null)
        {
            head=null;
            tail=null;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        tail=temp;
        temp.next=null;
        return x;
    }

//    remove from index
    int removeFromInd(int ind)
    {
        size--;
        Node temp = head;
        int x;
        if(ind==0)
        {
             x= startRemove();
             return x;
        }
        for(int i=1;i<ind;i++)
        {
            temp = temp.next;
        }
        if(temp.next==null)
        {
             x = endRemove();
            return x;
        }
        x= (temp.next).value;
        temp.next = temp.next.next;
//        temp.next.next=null;

        return x;
    }

    Node getVal(int index)
    {
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    void insertUsingRecursion(int index, int val)
    {
        size++;
//        System.out.println(head.value);
      insertUsingRec(index , val , head);
        System.out.println("Inserted element");
    }
    private Node insertUsingRec(int index , int val ,Node node)
    {
        System.out.println(index);
      if(index==0)
      {
          System.out.println("Index=0");
          Node temp = new Node();
          temp.value = val;
          temp.next = node;

          return temp;
      }
      node.next= insertUsingRec(index-1,val,node.next);
      return node;
    }
    void displaySize(){
        System.out.println("Size = "+size);
    }

    void BubbleSort(){
      for(int i=0;i<size-1;i++)
      {
          for(int j=0;j<size-1;j++)
          {
              Node first = getVal(j);
              Node second = getVal(j+1);
//              System.out.println("First Value = "+first.value + " Second Value "+ second.value);

              if(first.value>second.value)
              {
//                  Swap
//                  System.out.println("Swapping "+first.value+" with "+second.value);
                  swap(first,second,j);
              }
          }
      }
    }

    void swap(Node first , Node second,int j)
    {
         if(first==head)
         {
             first.next=second.next;
             second.next=first;
             head=second;
         }
         else if(second==tail)
         {
             Node prev = getVal(j-1);
             prev.next=second;
             second.next=first;
             first.next=null;
             tail=first;
         }
         else{
             Node prev = getVal(j-1);
             prev.next = second;
             first.next=second.next;
             second.next=first;
         }
    }

    void reverseUsingRec(){
        reverse1(head);
        tail.next=null;
    }
    private void reverse1(Node temp)
    {
        if(temp.next==null)
        {
            head=temp;
            return;
        }
        reverse1(temp.next);
        tail.next = temp;
        tail = temp;
    }


    void reverseUsingIteration(){
        Node prev=null;
        Node pres = head;
        Node next = head.next;

        while(pres!=null)
        {
            pres.next = prev;
            prev=pres;
            pres=next;
            if(next!=null)
             next=next.next;
        }
        head=prev;
    }


}
