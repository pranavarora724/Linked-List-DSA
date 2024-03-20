package LeetCode_Questions;

import Basics_Making_Custom_Linked_List.Single_Linked_List.Single_Linked_List;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

//        s1.display();

        Palindrome_Linked_List p1 = new Palindrome_Linked_List();
        p1.inserAtBeg(1);
        p1.inserAtBeg(1);
        p1.inserAtBeg(2);
        p1.inserAtBeg(1);
        p1.display(p1.returnHead());

        System.out.println(p1.isPalindrome(p1.returnHead()));
//        p1.isPalindrome(s1.returnHead());
    }
}