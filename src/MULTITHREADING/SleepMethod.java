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
 
public class SleepMethod implements Runnable
{
    Thread t;
    public void run()
    {
        for (int i = 0; i < 4; i++)
        {
            System.out.println(Thread.currentThread().getName()
                                                   + "  " + i);
            try
            {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(1000);
            }
 
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
 
    public static void main(String[] args) throws Exception
    {
        Thread t = new Thread(new SleepMethod());
 
        // call run() function
        t.start();
 
        Thread t2 = new Thread(new SleepMethod());
 
        // call run() function
        t2.start();
    }
}