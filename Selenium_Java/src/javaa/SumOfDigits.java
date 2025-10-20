package javaa;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Number: ");
		int number = scan.nextInt();
		int sum=0;
		
		while(number!=0) {
			int lastdigit = number%10;    //get lastdigit
			sum += lastdigit;             //add lastdigit to sum
			number /= 10;                //remove lastdigit
//			System.out.println("Last digit: " + lastdigit);
//			System.out.println("Sum in loop: " + sum);
//			System.out.println("Number: " + number);
		}
		System.out.println("Sum: " + sum);
		scan.close();
	}

}
