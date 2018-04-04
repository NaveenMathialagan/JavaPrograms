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
// Java program to demonstrate working of HashSet
import java.util.*;
 
class HashSetDemo
{
    public static void main(String[]args)
    {
        HashSet<String> h = new HashSet<String>();
 
        // adding into HashSet
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");// adding duplicate elements
 
        // printing HashSet
        System.out.println(h);
        System.out.println("List contains India or not:" +
                           h.contains("India"));
 
        // Removing an item
        h.remove("Australia");
        System.out.println("List after removing Australia:"+h);
 
        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}