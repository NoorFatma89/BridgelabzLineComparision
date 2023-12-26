package com.bridgelabz.linecomparision;

public class LineComparision {
		
		Line1 l1;
		Line2 l2;
		
//	 	Checking two line are equal or not using equals method
		public void checkLineEquality() {
			l1 = new Line1();  
			l2 = new Line2(); 		

			double lengthOfline1=l1.length1;
			Double doubleLengthOfline1 = lengthOfline1;

			double lengthOfline2= l2.length2;
			Double doubleLengthOfline2 = lengthOfline2;
	        
	        if (doubleLengthOfline1.equals(doubleLengthOfline2))
	            System.out.println("Lines are equal Compared Using equals() method");
	        else
	            System.out.println("Lines are not equal Compared Using equals() method");
		}
		
//		Comparing Two lines using compareTo method
		public void compareTwoLines() {
			l1 = new Line1();  
			l2 = new Line2(); 

			double lengthOfline1=l1.length1;
			Double doubleLengthOfline1 = lengthOfline1;

			double lengthOfline2= l2.length2;
			Double doubleLengthOfline2 = lengthOfline2;
			
			int value=doubleLengthOfline1.compareTo(doubleLengthOfline2);
	        
	        if (value<0)
	            System.out.println("First Line is less than second Line Compared Using compareTo() method");
	        else if(value>0)
	        	System.out.println("First Line is greater than second Line Compared Using compareTo() method");
	        else
	            System.out.println("Both Lines are equal Compared Using compareTo() method");
		}
			
}
