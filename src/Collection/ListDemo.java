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
 
public class ListDemo
{
    public static void main (String[] args)
    {
        // Let us create a list
        List l1 = new ArrayList();
        l1.add(0, 1);  // adds 1 at 0 index
        l1.add(1, 2);  // adds 2 at 1 index
        System.out.println(l1);  // [1, 2]
 
        // Let us create another list
        List l2 = new ArrayList();
        l2.add(1);
        l2.add(2);
        l2.add(3);
 
        // will add list l2 from 1 index
        l1.addAll(1, l2);
        System.out.println(l1);
 
        l1.remove(1);     // remove element from index 1
        System.out.println(l1); // [1, 2, 3, 2]
 
        // prints element at index 3
        System.out.println(l1.get(3));
 
        l1.set(0, 5);   // replace 0th element with 5
        System.out.println(l1);  // [5, 2, 3, 2]
      
        //=========================Search====================================
        
         // type safe array list, stores only string
        List<String> l = new ArrayList<String>(5);
        l.add("Geeks");
        l.add("for");
        l.add("Geeks");
 
        // Using indexOf() and lastIndexOf()
        System.out.println("first index of Geeks:" +
                                  l.indexOf("Geeks"));
        System.out.println("last index of Geeks:" +
                               l.lastIndexOf("Geeks"));
        System.out.println("Index of element not present : " +
                                l.indexOf("Hello"));
        
        //============================Range===============================
        
         // Type safe array list, stores only string
        List<String> list = new ArrayList<String>(5);
 
        list.add("GeeksforGeeks");
        list.add("Practice");
        list.add("GeeksQuiz");
        list.add("IDE");
        list.add("Courses");
 
        List<String> range = new ArrayList<String>();
 
        // return List between 2nd(inclistuding)
        // and 4th elistement(exclistuding)
        range = list.subList(2, 4);
 
        System.out.println(range);  // [GeeksQuiz, IDE]
    }
}