/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS;

/**
 *
 * @author Naveen
 */

class A1 {
   static void fun() {
      System.out.println("A.fun()");
   }
}
 
class B1 extends A1{ 
   static void fun() {   
      System.out.println("B.fun()");
   }
}

public class MethodHiding {
    public static void main(String args[]){
         A1 a = new B1();
      a.fun();  // prints A.fun()
    }
}
//If we make both A.fun() and B.fun() as non-static then the above program would print “B.fun()”.