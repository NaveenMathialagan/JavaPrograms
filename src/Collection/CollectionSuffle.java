/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Naveen
 */
public class CollectionSuffle {
      public static void main(String[] args)
    {
        ArrayList<String>  mylist = new ArrayList<String>();
        mylist.add("code");
        mylist.add("quiz");
        mylist.add("geeksforgeeks");
        mylist.add("quiz");
        mylist.add("practice");
        mylist.add("qa");
 
        System.out.println("Original List : \n" + mylist);
 
        Collections.shuffle(mylist);
 
        System.out.println("\nShuffled List : \n" + mylist);
    }
}
