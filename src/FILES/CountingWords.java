/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FILES;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Naveen
 */
public class CountingWords {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        File file = new File("1.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
         
        String line;
         
        // Initializing counters
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        int paragraphCount = 1;
        int whitespaceCount = 0;
         
        // Reading line by line from the 
        // file until a null is returned
        while((line = reader.readLine()) != null)
        {
            if(line.equals(""))
            {
                paragraphCount++;
            }
            if(!(line.equals("")))
            {
                 
                characterCount += line.length();
                 
                // \\s+ is the space delimiter in java
                String[] wordList = line.split("\\s+");
                 
                countWord += wordList.length;
                whitespaceCount += countWord -1;
                 
                // [!?.:]+ is the sentence delimiter in java
                String[] sentenceList = line.split("[!?.:]+");
                 
                sentenceCount += sentenceList.length;
            }
        }
         
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Number of paragraphs = " + paragraphCount);
        System.out.println("Total number of whitespaces = " + whitespaceCount);
    }
}
