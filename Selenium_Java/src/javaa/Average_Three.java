package javaa;

import java.util.Scanner;

public class Average_Three {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("First number: ");
		int firstNumber = scan.nextInt();
		System.out.print("Second number: ");
		int secondNumber = scan.nextInt();
		System.out.print("Third number: ");
		int thirdNumber = scan.nextInt();
		
		int sum = firstNumber + secondNumber + thirdNumber;
		int average = sum/3;
		System.out.println("Average: " + average);
		scan.close();
		
	}

}
