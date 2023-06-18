package ClassExercise;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Calculator sc = new Calculator();
		sc.display();

	}

	public static void display() {
		final char operator;
		double number1, number2, result;

		Scanner input = new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, or /");
		operator = input.next().charAt(0);

		System.out.println("Enter first number");
		number1 = input.nextDouble();

		System.out.println("Enter second number");
		number2 = input.nextDouble();

		switch (operator) {
		// Perform addition between numbers
		case '+':
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;

		// Perform subtraction between numbers
		case '-':
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;

		// Perform multiplication between numbers
		case '*':
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;

		case '/':
			result = number1 / number2;
			System.out.println(number1 + "/" + number2 + " = " + result);
			break;

		default:
			System.out.println("Invalid operator");
			break;
		}
		input.close();
	}

}
