/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACE;

/**
 *
 * @author Naveen
 */
// A simple interface
interface in1
{
    // public, static and final
    int A = 10;
 
    // public and abstract 
    void display();
   
}
 
// A class that implements interface.
class Test implements in1
{
    // Implementing the capabilities of
    // interface.
    @Override
    public void display()
    {
        System.out.println("Geek");
    }
 
    // Driver Code
    public static void main (String[] args)
    {
        Test t = new Test();
        t.display();
        System.out.println(A);
        
        
    }
}