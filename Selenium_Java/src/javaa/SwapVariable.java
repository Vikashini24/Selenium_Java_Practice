package javaa;

import java.util.Scanner;

public class SwapVariable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("First variable: ");
		int firstVariable = scan.nextInt();
		System.out.print("Second variable: ");
		int secondVariable = scan.nextInt();
		int temp = 0;
		temp = firstVariable;
		firstVariable = secondVariable;
		secondVariable = temp;
		
		System.out.println("Swapped first variable: " + firstVariable);
		System.out.println("Swapper second variable: " + secondVariable);
		scan.close();
		
	}

}
