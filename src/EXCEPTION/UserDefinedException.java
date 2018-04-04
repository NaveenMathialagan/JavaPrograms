/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXCEPTION;

/**
 *
 * @author Naveen
 */
// A Class that represents use-defined expception
class MyException extends Exception
{
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
public class UserDefinedException {
    public static void main(String args[]){
          try
        {
            // Throw an object of user defined exception
            throw new MyException("GeeksGeeks");
        }
        catch (MyException ex)
        {
            System.out.println("Caught");
 
            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}
