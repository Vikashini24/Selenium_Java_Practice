package javaa;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		
		System.out.print("Enter " + size + "element: ");
		for(int i=0; i<size; i++) {
			numbers[i] = scan.nextInt();
		}
		
		
	}

}
