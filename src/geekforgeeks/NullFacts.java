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
public class NullFacts {
    
    public static void main(String args[]){
        NullFacts nf=null;
        nf.staticMethod();
        //nf.nonStaticMethod();
        
        System.out.println(null==null);
        //return false;
        System.out.println(null!=null);
    
        Integer i = null;
        Integer j = 10;
             
        //prints false
        System.out.println(i instanceof Integer);
         
        //Compiles successfully
        System.out.println(j instanceof Integer);
    }
    
    private static void staticMethod()
    {
        //Can be called by null reference
        System.out.println("static method, can be called by null reference");
    }
    
    private void nonStaticMethod()
    {
        //Can not be called by null reference
        System.out.print(" Non-static method- ");
        System.out.println("cannot be called by null reference");
    }
    
}
