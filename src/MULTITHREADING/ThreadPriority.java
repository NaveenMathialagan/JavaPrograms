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
class ThreadPriority extends Thread
{
    public void run()
    {
        System.out.println("Inside run method");
    }
 
    public static void main(String[]args)
    {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();
 
        System.out.println("t1 thread priority : " +
                              t1.getPriority()); // Default 5
        System.out.println("t2 thread priority : " +
                              t2.getPriority()); // Default 5
        System.out.println("t3 thread priority : " +
                              t3.getPriority()); // Default 5
 
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
 
        // t3.setPriority(21); will throw IllegalArgumentException
        System.out.println("t1 thread priority : " +
                              t1.getPriority());  //2
        System.out.println("t2 thread priority : " +
                              t2.getPriority()); //5
        System.out.println("t3 thread priority : " +
                              t3.getPriority());//8
 
        // Main thread
        System.out.print(Thread.currentThread().getName());
        System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority());
 
        // Main thread priority is set to 10
        Thread.currentThread().setPriority(10);
        System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority());
    }
}
