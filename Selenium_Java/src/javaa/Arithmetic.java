package javaa;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("First number: " );
		int firstNumber = scan.nextInt();
		System.out.print("Second number: " );
		int secondNumber = scan.nextInt();
		
		int add = firstNumber + secondNumber;
		System.out.println("Add: " + add);
		int subtract = firstNumber - secondNumber;
		System.out.println("Subtract: " + subtract);
		int multiply = firstNumber * secondNumber;
		System.out.println("Multiply: " + multiply);
		int divide = firstNumber + secondNumber;
		System.out.println("Divide: " + divide);
		int modulo = firstNumber % secondNumber;
		System.out.println("Module: " + modulo);
		
		scan.close();
		
	}

}
