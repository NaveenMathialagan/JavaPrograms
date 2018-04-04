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
public class Overloading {
    
      public int sum(int x, int y) {
        return (x + y);
    }
 
    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z) { 
         return (x + y + z);
    }
 
    // Overloaded sum(). This sum takes two double parameters
    public double sum(double x, double y) { 
         return (x + y);
    }   
 
    public static void main(String args[]){
        Overloading s = new Overloading();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}
