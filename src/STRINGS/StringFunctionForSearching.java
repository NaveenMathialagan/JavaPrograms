/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRINGS;

/**
 *
 * @author Naveen
 */
public class StringFunctionForSearching {
    public static void main(String args[]){
         String str = "GeeksforGeeks is a computer science portal";
 
    // Returns index of first occurrence of character.
    int firstIndex = str.indexOf('s');
    System.out.println("First occurrence of char 's'" +
                       " is found at : " + firstIndex);
 
    // Returns index of last occurrence specified character.
    int lastIndex = str.lastIndexOf('s');
    System.out.println("Last occurrence of char 's' is" +
                       " found at : " + lastIndex);
 
    // Index of the first occurrence of specified char
    // after the specified index if found.
    int first_in = str.indexOf('s', 10);
    System.out.println("First occurrence of char 's'" +
                       " after index 10 : " + first_in);
 
    int last_in = str.lastIndexOf('s', 20);
    System.out.println("Last occurrence of char 's'" +
                     " after index 20 is : " + last_in);
 
    // gives ASCII value of character at location 20
    int char_at = str.charAt(20);
    System.out.println("Character at location 20: " +
                                             char_at);
 
    // throws StringIndexOutOfBoundsException
    // char_at = str.charAt(50);
    
    // This is a string in which a substring
    // is to be searched.
    str = "GeeksforGeeks is a computer science portal";
 
    // Returns index of first occurrence of substring
     firstIndex = str.indexOf("Geeks");
    System.out.println("First occurrence of char Geeks"+
               " is found at : " + firstIndex);
 
    // Returns index of last occurrence
    lastIndex = str.lastIndexOf("Geeks");
    System.out.println("Last occurrence of char Geeks is"+
               " found at : " + lastIndex);
 
    // Index of the first occurrence
    // after the specified index if found.
    int first_in1 = str.indexOf("Geeks", 10);
    System.out.println("First occurrence of char Geeks"+
               " after index 10 : " + first_in1);
 
    int last_in1 = str.lastIndexOf("Geeks", 20);
    System.out.println("Last occurrence of char Geeks " +
               "after index 20 is : " + last_in1);
    }
}
