package Circular_Linked_List;

public class main
{
    public static void main(String[] args)
    {
        Circular_Linked_List ob = new Circular_Linked_List();

        ob.startInsert(11);
        ob.startInsert(3);
        ob.startInsert(2);
        ob.startInsert(14);
        ob.startInsert(7);

        ob.display();

        System.out.println(ob.deleteByValue(3));
        ob.display();

    }
}
