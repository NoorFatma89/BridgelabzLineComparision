package com.bridgelabz.linecomparision;

public class LineComparision {
		
		Line1 l1;
		Line2 l2;

		public void byEquals() {
			l1 = new Line1();  
			l2 = new Line2(); 
			if(new Double (l1.line1).equals( new Double (l2.line2))){
				  System.out.println("Lenghth of line1 and line2 are Equal - Using equals() method");
			}else System.out.println("Lenghth of line1 and line2 are Not Equal - Using equals() method");
		}
		
		public void byCompareTo() {
			l1 = new Line1();  
			l2 = new Line2(); 
			if((new Double (l1.line1).compareTo(new Double (l2.line2)))==0){
				  System.out.println("Both Lenght of lines are Equal - Using compareTo() method");
			}else if ((new Double (l1.line1).compareTo(new Double (l2.line2)))>0) {
				  System.out.println("Lenghth of line1 is Greater than line2 - Using compareTo() method");
			}else System.out.println("Lenghth of line2 is Greater than line1 - Using compareTo() method");		
		}	
}