package javaa;

import java.util.Scanner;

public class CountCharString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = scan.nextLine();
		int count = string.length();
		System.out.println("String count: " + count);
		scan.close();
		
	}

}
