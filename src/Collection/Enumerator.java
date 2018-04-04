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
// Java program to demonstrate Enumeration
import java.util.Enumeration;
import java.util.Vector;
 
public class Enumerator
{
    public static void main(String[] args)
    {
        // Create a vector and print its contents
        Vector v = new Vector();
        for (int i = 0; i < 10; i++)
            v.addElement(i);
        System.out.println(v);
 
        // At beginning e(cursor) will point to
        // index just before the first element in v
        Enumeration e = v.elements();
 
        // Checking the next element availability
        while (e.hasMoreElements())
        {
            // moving cursor to next element
            int i = (Integer)e.nextElement();
 
            System.out.print(i + " ");
        }
    }
}
