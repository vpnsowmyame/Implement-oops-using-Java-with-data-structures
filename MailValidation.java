package ClassExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MailValidation {

	public static void main(String[] args) {
		List<String> mailidset = new ArrayList<>();
		
		mailidset.add("vpnsowmyame@gmail.com");
		mailidset.add("santhoshmd@gmail.com");
		mailidset.add("sowmya.md@salesforce.com");
		mailidset.add("sowmyamd2023@gmail.com");
		mailidset.add("sourabhjoshivlogs@gmail.com");
		mailidset.add("bharthilimbachiya@gmail.com");
		mailidset.add("ishankkulkarni@gmail.com");
		mailidset.add("vinayak99@gmail.com");
		mailidset.add("shruti.rao@salesforce.com");
		
		System.out.println("Please enter a valid email id: ");
		Scanner mailInput = new Scanner(System.in);
		String mailid = mailInput.next();
		boolean flag = false;
		
		for(String name : mailidset) 
		{
			System.out.println("Checking with " +name);
			
		   if((name.equals(mailid))){ 
			 System.out.println(mailid + " validated");
			 flag = true;
			 break;
		   }

	    }
		if(flag == false) {
			System.out.println(mailid + " doesn't exist");
		}
		
	}

}
