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
class Derived 
{
    public void getDetails(String temp)
    {
        System.out.println("Derived class " + temp);
    }
}
 
public class Overriding extends Derived
{
  
    public int getDetailss(String temp)
    {
        System.out.println("Test class " + temp);
        return 0;
    }
    public static void main(String[] args)
    {
        Overriding obj = new Overriding();
        obj.getDetails("GFG");
    }
}