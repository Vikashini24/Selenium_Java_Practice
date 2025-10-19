package javaa;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("First number: ");
		int firstNumber = scan.nextInt();
		System.out.print("Second number: ");
		int secondNumber = scan.nextInt();
		
		if(firstNumber>secondNumber) {
			System.out.println("First number is greater");
		}
		else if(firstNumber<secondNumber) {
			System.out.println("Second number is greater");
		}
		else {
			System.out.println("Both are same");
		}
		scan.close();
		
	}

}
