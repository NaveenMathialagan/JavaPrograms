/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Naveen
 */
public class TreeSetDemo {
     public static void main (String[] args)
    {
        TreeSet ts1= new TreeSet();
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
 
        // Duplicates will not get insert
        ts1.add("C");
 
        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);  // [A,B,C]
 
        // ts1.add(2) ; will throw ClassCastException
        //             at run time
        ArrayList al = new ArrayList();
        al.add("GeeksforGeeks");
        al.add("GeeksQuiz");
        al.add("Practice");
        al.add("Compiler");
        al.add("Compiler"); //will not be added
 
        // Creating a TreeSet object from ArrayList
        TreeSet ts4 = new TreeSet(al);
 
        // [Compiler,GeeksQuiz,GeeksforGeeks,Practice]
        System.out.println(ts4);
        
    }
}
