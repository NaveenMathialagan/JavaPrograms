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
import java.util.*;
class Test1
{
    interface Yes
    {
        void show();
    }
}
 
class Testing implements Test1.Yes
{
    public void show()
    {
        System.out.println("show method of interface");
    }
}
 
class NestedInterface
{
    public static void main(String[] args)
    {
        Test1.Yes obj;
        Testing t = new Testing();
        obj=t;
        t.show();
    }
}
