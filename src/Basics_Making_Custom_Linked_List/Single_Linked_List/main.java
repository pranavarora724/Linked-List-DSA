package Basics_Making_Custom_Linked_List.Single_Linked_List;

public class main
{
    public static void main(String[] args) {

        Single_Linked_List ob = new Single_Linked_List();

        ob.startInsert(10);
        ob.startInsert(11);
        ob.startInsert(7);
        ob.lastInsert(17);
        ob.startInsert(5);
        ob.lastInsert(1);

        ob.display();
        ob.insertAtInd(2,20);
        ob.display();

        System.out.println(ob.startRemove());
        ob.display();
        System.out.println(ob.endRemove());
        ob.display();
//
//        System.out.println(ob.removeFromInd(3));
//        ob.display();
//
//        System.out.println(ob.removeFromInd(3));
//        ob.display();

        ob.insertUsingRecursion(3,20);
        ob.display();

//        System.out.println("Size = "+size);
ob.displaySize();

        System.out.println("Performing bubble Sort");
        ob.BubbleSort();
        ob.display();

        System.out.println("Performing Reversal");
        ob.reverseUsingRec();
        ob.display();


        System.out.println("Performing Reversal");
        ob.reverseUsingIteration();
        ob.display();
    }
}
