package javaa;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = scan.nextLine();
		String reversedString = "";
		for(int i=string.length()-1; i>=0; i--) {
			reversedString += string.charAt(i);
		}
		System.out.println("Reversed string: " + reversedString);
		scan.close();
		
		
	}

}
