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
 
public class StaticVarFact {
    
   public static class StaticEx{
        static int a=10;
        public void access(){
             a++;
             System.out.println(a);
        }    
    }
   static class InstantEx{
        int a=10;
        public void access(){
             a++;
             System.out.println(a);
        } 
       
   }
    public static void main(String arg[]){
        
        StaticEx e=new StaticEx();
        e.access();
        StaticEx e1=new StaticEx();
        e.access();
        
        InstantEx ie=new InstantEx();
        ie.access();
        InstantEx ie1=new InstantEx();
        ie1.access();
    }
}
