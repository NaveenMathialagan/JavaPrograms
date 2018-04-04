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
class a{
    a(){
        //System.out.println("class a");
    }
    public int var=11;
    public void show(){
        System.out.println("A show");
    }
}
class b extends a{
    b(){
        //System.out.println("class b");
    }
    public void show(){
        System.out.println("B show");
    }
    public void show1(){
         System.out.println("B show");
    }
    
}
public class ObjectReferencing 
{
    public static void main(String args[]) 
    {
        b aob=new b();
        aob.show();
        a aob2=new b();
        aob2.show();
        System.out.println(aob2.var);
        
    }
}