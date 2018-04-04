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
class base {
  base() {
    System.out.println("Base Class Constructor Called ");
  }
}
 
class derived extends base {
  derived() {
    System.out.println("Derived Class Constructor Called ");
  }
}
public class InheritenceConstructor {
    public static void main(String a[]){
        derived d = new derived();
    }
}
