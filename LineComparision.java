package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparision {
	int x1,x2,y1,y2,x3,x4,y3,y4;
	
	public void takingInput() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter x1 value: ");
		x1=scanner.nextInt();
		System.out.print("Enter x2 value: ");
		x2=scanner.nextInt();
		System.out.print("Enter y1 value: ");
		y1=scanner.nextInt();
		System.out.print("Enter y2 value: ");
		y2=scanner.nextInt();
	}
	
	public void takingInput2() {
		Scanner scanner=new Scanner(System.in);

        System.out.print("Enter x3 value: ");
        x3 = scanner.nextInt();
        System.out.print("Enter x4 value: ");
        x4 = scanner.nextInt();
        System.out.print("Enter y3 value: ");
        y3 = scanner.nextInt();
        System.out.print("Enter y4 value: ");
        y4 = scanner.nextInt(); 
	}
	
	public double lengthCalculator(double p1, double q1,double p2, double q2) {
		return (Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(q2 - q1, 2)));
	}
//	Calculating length of a line	
	public void calculateLengthOfLine() {
	    System.out.println("To calculate Length of a Line -");
		takingInput();
		double length=lengthCalculator(x1,y1,x2,y2);
		System.out.println("The length of a Line is: " +length);
	}
	
// 	Checking two line are equal or not
	public void checkLineEquality() {
	    System.out.println("To check two line are Equal or not by equals Method -");
	    
		System.out.println("Enter values of Line 1 ");
		takingInput();
		double lengthOfline1=lengthCalculator(x1,y1,x2,y2);
		Double doubleLengthOfline1 = lengthOfline1;
		
		System.out.println("Enter values of Line 2");
		takingInput2();
		double lengthOfline2= lengthCalculator(x3,x4,y3,y4);
		Double doubleLengthOfline2 = lengthOfline2;
        
        
        if (doubleLengthOfline1.equals(doubleLengthOfline2))
            System.out.println("Lines are equal");
        else
            System.out.println("Lines are not equal");
    }
	
//	Comparing Two lines 
	public void compareTwoLines() {
	    System.out.println("To check line equality by compareTo Method  -");
		System.out.println("Enter values of Line 1 ");
		takingInput();
		double lengthOfline1=lengthCalculator(x1,y1,x2,y2);
		Double doubleLengthOfline1 = lengthOfline1;
		
		System.out.println("Enter values of Line 2");
		takingInput2();
		double lengthOfline2= lengthCalculator(x3,x4,y3,y4);
		Double doubleLengthOfline2 = lengthOfline2;
		
		
        int value=doubleLengthOfline1.compareTo(doubleLengthOfline2);
        
        if (value<0)
            System.out.println("First Line is less than second Line ");
        else if(value>0)
        	System.out.println("First Line is greater than second Line");
        else
            System.out.println("Both Lines are equal");
	}
	
}


