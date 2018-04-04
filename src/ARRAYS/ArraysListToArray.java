/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Naveen
 */
public class ArraysListToArray {
    public static void main(String args[]){
         List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
 
        Object[] objects = al.toArray();
 
        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");
        
        System.out.println();
    }
}
