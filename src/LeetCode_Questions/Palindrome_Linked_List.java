package LeetCode_Questions;

public class Palindrome_Linked_List
{
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
    ListNode head1 = new ListNode();
    ListNode tail1 = new ListNode();

    public void display(ListNode head)
    {
        ListNode temp = head;
        System.out.println("Head = "+head.val);
        System.out.println("Tail = "+ tail1.val);
        System.out.println("Printing values");
        while(temp!=null)
        {

            System.out.print(temp.val + "\t");
            temp = temp.next;
        }
    }

    public void inserAtBeg(int val)
    {
        ListNode temp =new ListNode() ;
        temp.val = val;
        temp.next=null;
//        System.out.println(val);
        if(head1.val==0)
        {
            System.out.println("If executed");
            head1 = temp;
            tail1 = temp;
            head1.next = temp;
        }
        else{
            System.out.println("Elese executed");
            tail1.next = temp;
            tail1 = temp;
//            tail1.next = null;
//            tail1.next = null;
        }
        tail1.next = null;
    }

    public ListNode returnHead(){
        return head1;
    }

    public boolean isPalindrome(ListNode head)
    {
//        System.out.println(head.val);
        ListNode headFirst = head;
        ListNode headSecond = findMiddle(head);
        System.out.println("Middle element  = "+ headSecond.val);
        ListNode temp = headSecond;

        System.out.println(headSecond.val);

//        Now reverse the other Half
        headSecond = reverse(headSecond);

        System.out.print("First Half = "  );
        display(headFirst);
        System.out.print("Seconf Hlff = ");
        display(headSecond);


        while(headFirst!=null && headSecond!=null)
        {
            if(headFirst.val == headSecond.val){
                headFirst = headFirst.next;
                headSecond = headSecond.next;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;

        while(pres!=null)
        {
            pres.next = prev;

            prev = pres;
            pres = next;

            if(next!=null)
                next = next.next;
        }

        return prev;
    }

    public ListNode findMiddle(ListNode head)
    {
      ListNode slow = head;
      ListNode fast = head;
//        System.out.println(slow.val);

        while (fast!=null && (fast.next!=null) )
        {
            slow = slow.next;
            fast = fast.next.next;
        }
//        System.out.println(slow.val);
        return slow;
    }
}
