/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author Naveen
 */
import java.util.*;
public class CollectionSwap {
     public static void main(String[] args)
    {
        // Let us create a list with 4 items
        ArrayList<String>  mylist =
                        new ArrayList<String>();
        mylist.add("code");
        mylist.add("practice");
        mylist.add("quiz");
        mylist.add("geeksforgeeks");
 
        System.out.println("Original List : \n" + mylist);
 
        // Swap items at indexes 1 and 2
        Collections.swap(mylist, 1, 2);
 
        System.out.println("\nAfter swap(mylist, 1, 2) : \n"
                           + mylist);
 
        // Swap items at indexes 1 and 3
        Collections.swap(mylist, 3, 1);
 
        System.out.println("\nAfter swap(mylist, 3, 1) : \n"
                           + mylist);
    }
}
