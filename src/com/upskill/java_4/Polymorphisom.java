package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphisom extends MethodType {
	
	/* 	Polymorphism is the ability of an object to take on many forms.
	 
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	      same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
	      same method name from parent class to override 
*/

	public static void main(String[] args) {
   car();
   car("Blue");
   car(4);
   car("Red", 4);
   weeklyIncomeStatic();
   
	}
	 
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
	int RealEstateIncome = 1400;
	int totalIncome = calculateWeeklyIncome+RealEstateIncome;
	System.out.println("My Weekly Income =" + totalIncome);
	}
	
	public static void car (){
		System.out.println("My car is Audi");
	}
	
    public static void car (String color){
	System.out.println("My car is Audi,my audi color:" + color);
}
  public static void car (int door){
	  System.out.println("My car is Audi, my audi door:" + door);
	  
  }

  public static void car(String color , int door){
	  System.out.println("My car color Audi : " + color +  " ,My car door:" + door);
	  
  }
  
}
