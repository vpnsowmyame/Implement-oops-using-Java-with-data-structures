package ClassExercise;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter fwriter = new FileWriter("C://Users//Rosso//Downloads//Sample.txt");
			fwriter.write("Practice makes man perfect!!!");
			fwriter.close();
			System.out.println("The content is successfully written inside the file.");
		} catch (IOException e) {
			System.out.println("Unexpected error occurred...");
			e.printStackTrace();
		}

	}

}
