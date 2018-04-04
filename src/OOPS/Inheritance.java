/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS;

import java.util.Random;






public class Inheritance {

  
    
    public static void main(String args[]){
       Inheritance inheritance=new Inheritance();
       
    }

   
    
}

class Student{

    public static int ID=0;
    public String name;
    public String SSN;
    public String email;
    public String userID;
    public String phone;
    public String city;
    public String state;
    public Random r=new Random();
    public Student(String name,String SSN) {
       ID++;
       this.name=name;
       this.SSN=SSN;
       this.userID= ID+""+(r.nextInt(9000-1000+1)+1000)+""+SSN.substring(SSN.length()-4,SSN.length());
    }
    
    public void enroll(){
    
    }
  
    public void pay(){
    
    }
    
    public void chechBalance(){
    
    }

    @Override
    public String toString() {
        return userID+" "+name;
    }
    public void showCourse(){
    
    }
    
     public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    
}
