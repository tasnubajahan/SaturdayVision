package com.upskill.java_4;

public class Encapsulation {
	//encapsulation used to hide data using setter and getter method
	
	private String name = "Tasnuba";              // write & read
	private int ssn = 12345678;                   //write only
	private String username =" Upskill";          //read only

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setSSN(37347931);
		System.out.println(obj.getUsername());
		obj.setname("tasnuba");
		System.out.println(obj.getName());
		
	}
	//setter method
	public void setSSN(int value){
		ssn= value;
	}
	//gatter method
	public String getUsername(){
	return username;
	}
	
	
	public void setname(String value){
		name= value;
	}
		public String getName(){
			return name;
	}

	}
