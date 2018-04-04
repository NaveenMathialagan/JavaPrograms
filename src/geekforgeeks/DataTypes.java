/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geekforgeeks;

/**
 *
 * @author Naveen
 */
public class DataTypes {
    public static void main(String args[]){
          boolean b = true;       
          if (b == true)
            System.out.println("Hi Geek");
          
        //========Byte=========
        byte a = 126;
        // byte is 8 bit value
        System.out.println(a);
        a++;
        System.out.println(a);
        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a);
        // Looping back within the range
        a++;
        System.out.println(a);
        
        //=====================
        
          // declaring character
         char a1 = 'G';
          
        // Integer data type is generally 
        // used for numeric values
        int i=89;
         
        // use byte and short if memory is a constraint 
        byte b1 = 4;
         
        // this will give error as number is 
        // larger than byte range
        // byte b1 = 7888888955;
         
        short s = 56;
         
        // this will give error as number is 
        // larger than short range
        //short s1 = 87878787878;
         
         
        // by default fraction value is double in java
        double d = 4.355453532;
         
        // for float use 'f' as suffix
        float f = 4.7333434f;
        
        System.out.println("char: " + a1); 
        System.out.println("integer: " + i); 
        System.out.println("byte: " + b1); 
        System.out.println("short: " + s); 
        System.out.println("float: " + f); 
        System.out.println("double: " + d); 
    }
}
