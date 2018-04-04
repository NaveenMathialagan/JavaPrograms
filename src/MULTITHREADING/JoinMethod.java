/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MULTITHREADING;

/**
 *
 * @author Naveen
 */
import java.lang.*;
 
public class JoinMethod implements Runnable
{
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: "
                               + t.getName());
 
        // checks if current thread is alive
        System.out.println("Is Alive? "
                               + t.isAlive());
    }
 
    public static void main(String args[]) throws Exception
    {
        Thread t = new Thread(new JoinMethod());
        t.start();
 
        // Waits for 1000ms this thread to die.
        t.join(1000);
 
        System.out.println("\nJoining after 1000"+
                             " mili seconds: \n");
        System.out.println("Current thread: " +
                                    t.getName());
 
 
        // Checks if this thread is alive
        System.out.println("Is alive? " + t.isAlive());
    }
}
