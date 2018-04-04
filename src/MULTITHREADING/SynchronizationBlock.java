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
import java.util.*;
 
class Geek1
{
    String name = "";
    public int count = 0;
 
    public void geekName(String geek, List<String> list)
    {
        // Only one thread is permitted
        // to change geek's name at a time.
        synchronized(this)
        {
            name = geek;
            count++;  // how many threads change geek's name.
        }
 
        // All other threads are permitted
        // to add geek name into list.
        list.add(geek);
    }
}
 
class SynchronizationBlock
{
    public static void main (String[] args)
    {
        Geek1 gk = new Geek1();
        List<String> list = new ArrayList<String>();
        gk.geekName("mohit", list);
        System.out.println(gk.name);
 
    }
}