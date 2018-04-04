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
class a1{
    a1(){
        System.out.println("a1 cons called");
    }
    public void show(int i){
        System.out.println(i);
    }
}
class b1 extends a1{
    b1(){
        System.out.println("b1 cons called");
    }
    @Override
    public void show(int i){
        super.show(i);
    }
}
public class Inheritence {
    public static void main(String args[]){
        a1 a=new b1();
        a.show(5);
        
    }
}
