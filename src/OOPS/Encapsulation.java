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
class Encapsulate
{
    //private variables declared 
    //these can only be accessed by 
    //public methods of class
    private String geekName;
    private int geekRoll;
    private int geekAge;
 
    //get method for age to access 
    //private variable geekAge
    public int getAge() 
    {
      return geekAge;
    }
  
    //get method for name to access 
    //private variable geekName
    public String getName() 
    {
      return geekName;
    }
     
    //get method for roll to access 
    //private variable geekRoll
    public int getRoll() 
    {
       return geekRoll;
    }
  
    //set method for age to access 
    //private variable geekage
    public void setAge( int newAge)
    {
      geekAge = newAge;
    }
  
    //set method for name to access 
    //private variable geekName
    public void setName(String newName)
    {
      geekName = newName;
    }
     
    //set method for roll to access 
    //private variable geekRoll
    public void setRoll( int newRoll) 
    {
      geekRoll = newRoll;
    }
}
public class Encapsulation {
    public static void main(String argsp[]){
        Encapsulate obj = new Encapsulate();
         
        //setting values of the variables 
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);
         
        //Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());
         
        //Direct access of geekRoll is not possible
        //due to encapsulation
        //System.out.println("Geek's roll: " + obj.geekName);
    }
}
