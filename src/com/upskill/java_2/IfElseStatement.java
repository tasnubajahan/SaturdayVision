package com.upskill.java_2;

public class IfElseStatement {
	//Conditional statement = Unknown data

	public static void main(String[] args) {
		
		  int age = 100;
		  
		  if (age <= 13){
			  System.out.println("You are Children");
		  }else if (age > 13 && age < 18){
			  System.out.println("You are teenager");
		  }else if (age >=60){
			  if (age >=100){
				  System.out.println("You are champion");
			  } else {
			  System.out.println("You are senior");
			  }
		  } else {
			  System.out.println("You are Adult");
			  
			  
		  }
	}

}






