/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INPUT_AND_OUTPUT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Naveen
 */
public class ReadingInput {
    public static void  main(String args[]) throws IOException{
        
        //Enter data using BufferReader
        /*BufferedReader reader = 
                   new BufferedReader(new InputStreamReader(System.in));
        
        // Reading data using readLine
        String name = reader.readLine();*/
 
        // Printing the read line
       
        
       String name = System.console().readLine();
         
        System.out.println(name);
    }
}
