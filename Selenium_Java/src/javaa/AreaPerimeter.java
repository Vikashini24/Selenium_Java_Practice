package javaa;

import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		
		/*
		 * Circle
		 * Area --> pi r2
		 * Perimeter --> 2 pi r
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Radius: ");
		double radius = scan.nextDouble();
		double areaC = Math.PI * radius * radius;
		System.out.println("Area of circle: " + areaC);
		double perimeterC = 2 * Math.PI * radius;
		System.out.println("Perimeter of circle: " + perimeterC);
		
		
		/*
		 * Rectangle
		 * Area --> l*b
		 * Perimeter --> 2(l+b)
		 */
		
		System.out.print("Length: ");
		double length = scan.nextDouble();
		System.out.print("Breadth: ");
		double breadth = scan.nextDouble();
		double areaR = length * breadth;
		System.out.println("Area of rectangle: " + areaR);
		double perimeterR = 2*(length*breadth);
		System.out.println("Perimeter of rectangle: " + perimeterR);
		
		scan.close();
		
	}

}
