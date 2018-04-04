package geekforgeeks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen
 */

public class CreatingObj {
    public static class A{
        static int a=10;
        public A(){
            
        }
    }
   
    public static void main(String args[]){
          A a=new A();
          System.out.println(a.a++);
              System.out.println(a.a);
          /* try
        {
            Class cls = Class.forName("A");
            A obj =(A) cls.newInstance();
            System.out.println(a.a);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }*/
         
         
    }
}
