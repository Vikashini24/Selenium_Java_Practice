package javaa;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Table Number: ");
		int tableNumber = scan.nextInt();
		System.out.print("End Number: ");
		int endNumber = scan.nextInt();
		for(int i=1; i<=endNumber; i++) {
			String table = i + "*" + tableNumber + "=" + i*tableNumber;
			System.out.println(table);
		}
		scan.close();
		
	}

}
