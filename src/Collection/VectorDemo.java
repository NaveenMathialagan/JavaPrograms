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
class VectorDemo    
{
    public static void main(String[] arg)
    {
        
        // create default vector
        Vector v = new Vector();
        
         
        v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("forGeeks");
        v.add(3);
        
        System.out.println("Vector is " + v);
        
       //==================================================== 
       ArrayList arr = new ArrayList();
       arr.add(3);
       arr.add("geeks");
       arr.add("forgeeks");
       arr.add(4);
        
       
        // createn default vector
        Vector v1 = new Vector();
         
        
        // copying all element of array list int0 vector
        v1.addAll(arr);
         
        // checking vector v
        System.out.println("vector v:" + v1);  
        
           if(v.contains("forGeeks"))
        System.out.println("forGeeks exists");
    }
}