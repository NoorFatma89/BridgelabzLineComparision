package com.bridgelabz.linecomparision;

public class Main {
	public static void main(String[] args) {
		LineComparision ln= new LineComparision();
		Line1 line1 = new Line1();
		Line2 line2 = new Line2();
		System.out.println("1st Line Between Two Points= "+line1.line1);
		System.out.println("2nd Line Between Two Points= "+line2.line2);
		ln.byEquals();
		ln.byCompareTo();
	}
}
