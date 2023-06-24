package ClassExercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		File f1 = new File("C://Users//Rosso//Downloads//Sample.txt");

		try {
			Scanner fileReader = new Scanner(f1);
			
			while(fileReader.hasNextLine()) {
				String fileData = fileReader.nextLine();
				System.out.println(fileData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
