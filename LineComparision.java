package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparision {
		
	public void CalculateLengthOfLine() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter x1 value: ");
		int x1=scanner.nextInt();
		System.out.print("Enter x2 value: ");
		int x2=scanner.nextInt();
		System.out.print("Enter y1 value: ");
		int y1=scanner.nextInt();
		System.out.print("Enter y2 value: ");
		int y2=scanner.nextInt();
		double length= Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("The length of a Line is: " +length);
		scanner.close();
	}
	
	public void checkLineEquality() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values of Line 1");
        System.out.print("Enter x1 value: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter x2 value: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y1 value: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter y2 value: ");
        int y2 = scanner.nextInt();

        Double lengthOfLine1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Enter values of Line 2");
        System.out.print("Enter x3 value: ");
        int x3 = scanner.nextInt();
        System.out.print("Enter x4 value: ");
        int x4 = scanner.nextInt();
        System.out.print("Enter y3 value: ");
        int y3 = scanner.nextInt();
        System.out.print("Enter y4 value: ");
        int y4 = scanner.nextInt();

        Double lengthOfLine2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));

        if (lengthOfLine1.equals(lengthOfLine2))
            System.out.println("Lines are equal");
        else
            System.out.println("Lines are not equal");
		scanner.close();        
    }
	
}
