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
import java.io.*;
 
// we can create thread by creating the 
// objects of that class.
class ThreadNaming extends Thread 
{
     
    @Override
    public void run()
    {
        System.out.println("Thread is running.....");
    }
}
 
class ThreadName
{
    public static void main (String[] args) 
    {
        // creating two threads
        ThreadNaming t1 = new ThreadNaming();
        ThreadNaming t2 = new ThreadNaming();
         
        // getting the above created threads names.
        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());
         
        t1.start();
        t2.start();
         
        // Now changing the name of threads.
        t1.setName("geeksforgeeks");
        t2.setName("geeksquiz");
         
        // again getting the new names 
        // of the threads.
        System.out.println("Thread names after changing the "+ 
        "thread names");
        System.out.println("New Thread 1 name:  " + t1.getName());
        System.out.println("New Thread 2 name: " + t2.getName());
         
    }
}