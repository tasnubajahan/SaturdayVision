package com.upskill.java_2;

public class IfElsepractic {

	public static void main(String[] args) {

		//For example, assigning grades (A, B, C) based on the 
		//percentage obtained by a student.
		//
		//if the percentage is above 90, assign grade A
		//if the percentage /is above 75, assign grade B
		//if the percentage is above 65, assign grade C
		   


		  int percentage = 90;
		    	
			    if (percentage >= 90){
			    System.out.println(" grade A");
	        } else if (percentage >= 75 ){
			    	System.out.println(" grade B");
	        }else if (percentage >= 65){
	        	System.out.println("grade C");
	        } else{
	        	System.out.println("Grade D");
	
			    }

	}

}
