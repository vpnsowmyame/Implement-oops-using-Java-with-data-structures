package ClassExercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "C://Users//Rosso//Downloads//Sample.txt";
             FileWriter fw = new FileWriter(filename,true); 
             //appends the string to the file
             fw.write("Java Exercises\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("C://Users//Rosso//Downloads//Sample.txt"));
             //read the file content
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
        }
}
