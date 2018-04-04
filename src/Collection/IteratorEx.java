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
// Java program to demonstrate Iterator
import java.util.ArrayList;
import java.util.Iterator;
 
public class IteratorEx
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
 
        for (int i = 0; i < 10; i++)
            al.add(i);
 
        System.out.println(al);
 
        // at beginning itr(cursor) will point to
        // index just before the first element in al
        Iterator itr = al.iterator();
 
        // checking the next element availabilty
        while (itr.hasNext())
        {
            //  moving cursor to next element
            int i = (Integer)itr.next();
 
            // getting even elements one by one
            System.out.print(i + " ");
 
            // Removing odd elements
            if (i % 2 != 0)
               itr.remove(); 
        }
        
        System.out.println(); 
        System.out.println(al);
        
    }
}