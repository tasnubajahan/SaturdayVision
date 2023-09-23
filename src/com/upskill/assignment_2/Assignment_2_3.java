package com.upskill.assignment_2;

public class Assignment_2_3 {

	public static int a;
	public static int b;
	public static void main(String[] args) {
		a= myFunction1();
		b= myFunction1();
		myMethod();
	}
	public static int myFunction1(){
		return 55;
	}
	public static int myMethod2(){
		return 65;
	}
	public static void myMethod(){
		if (a>b);{
			System.out.println("1st function is bigger then 2nd function");
			if (a<b);{
				System.out.println("2nd function is begger then 1st function");
				
			}
		}
		
	}

}
