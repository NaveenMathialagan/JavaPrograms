/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRINGS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Naveen
 */
public class StringReverse {
    public static void main(String args[]){
         String input = "Geeks for Geeks";
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
        String str=input1.toString();
        // reverse StringBuilder input1
        input1 = input1.reverse();
 
        // print reversed String
        for (int i=0; i<input1.length(); i++)
            System.out.print(input1.charAt(i));
        
   //===============================================================
        
        input = "GeeksForGeeks";
 
        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();
 
        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
    
     //============================================================
     
        input = "Geeks For Geeks";
        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();
 
        for (char c: hello)
            trial1.add(c);
 
        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
      //===========================================================
      
        input = "GeeksforGeeks";
 
        // getBytes() method to convert string 
        // into bytes[].
        byte [] strAsByteArray = input.getBytes();
 
        byte [] result = 
                   new byte [strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] = 
             strAsByteArray[strAsByteArray.length-i-1];
 
        System.out.println(new String(result));
    }
}
