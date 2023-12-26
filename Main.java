package com.bridgelabz.linecomparision;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation Program!");
		LineComparision lineComparision=new LineComparision();
		System.out.println();
		lineComparision.calculateLengthOfLine();
		System.out.println();
		lineComparision.checkLineEquality();
		System.out.println();
		lineComparision.compareTwoLines();
	}

}
