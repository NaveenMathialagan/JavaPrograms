/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geekforgeeks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Naveen
 */
class A implements Serializable{
    String s="";
    A(String s){
        this.s=s;
    }
}
public class Serialization {
   
   
   
    
    public static void main(String args[]) throws IOException, ClassNotFoundException{
        File file = new File("a.txt");
  
        //Create the file
        if (file.createNewFile()){
            System.out.println("File is created!");
        }else{
             System.out.println("File already exists."); 
        }
        
       A a=new A("Naveen");
       FileOutputStream fout=new FileOutputStream("a.txt");  
       ObjectOutputStream out=new ObjectOutputStream(fout);  
  
       out.writeObject(a);  
       out.flush();  
       System.out.println("success");  
       
       ObjectInputStream in=new ObjectInputStream(new FileInputStream("a.txt"));  
       A a1=(A)in.readObject();  
       System.out.println(a1.s);
    }
}
