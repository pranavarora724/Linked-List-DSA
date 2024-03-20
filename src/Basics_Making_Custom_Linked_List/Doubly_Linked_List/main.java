package Basics_Making_Custom_Linked_List.Doubly_Linked_List;

public class main
{
    public static void main(String[] args)
    {
        Doubly_Linked_List ob = new Doubly_Linked_List();
        ob.startInsert(21);
        ob.startInsert(2);
        ob.startInsert(31);
        ob.lastInsert(11);
        ob.lastInsert(5);

        ob.display();
        ob.displayRev();
    }
}
