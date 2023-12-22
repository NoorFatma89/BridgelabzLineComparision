package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparision {
		
	public void CalculateLengthOfLine() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter x1 value: ");
		double x1=scanner.nextInt();
		System.out.print("Enter x2 value: ");
		double x2=scanner.nextInt();
		System.out.print("Enter y1 value: ");
		double y1=scanner.nextInt();
		System.out.print("Enter y2 value: ");
		double y2=scanner.nextInt();
		double length= Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("The length of a Line is: " +length);
		scanner.close();
	}
}
