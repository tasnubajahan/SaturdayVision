package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
	//Array store multiple data using index
		//int age =30;        //variable
		int[] ageVision = new int [] {21,26,30,35};
		//Array index [0] [1] [2] [3] [4]
		
		System.out.println ("Student Age:" + ageVision[2]);
		System.out.println("Total student:"+ ageVision.length);
		
	
	
	
	String[] namevision = new String[] {"abid","Taiba","Riyan","Tasnuba","Mily"};
	
	System.out.println("Student Name :" + namevision[2]);
	System.out.println("Total student:"+ namevision.length);
	
	
		//Hashmap store multipal data using key-value pair, implementation of map interface
	
	HashMap<String, Integer> Student = new HashMap<String,Integer>();
	Student.put("Taiba", 21);
	Student.put("Mily", 30);
	Student.put("Jabed", 28);
	Student.put("Tasnuba", 26);
	Student.put("Samiul", 19);
	System.out.println("Hashmap Student Age:"+ Student.get("Mily"));
	
	HashMap<String, String> Country = new HashMap<String,String>();
	Country.put("Bangladesh", "Dhaka");
	Country.put("Usa", "Washington");
	Country.put("Canada", "Ottawa");
	System.out.println("HashMap capital" + Country.get("Bangladesh"));
	
	
	//HashTable store data using key-value pair,no duplicate,
	
	Hashtable<String, String> Country2 = new Hashtable<String,String>();
	Country2.put("Bangladesh", "Dhaka");
	Country2.put("Usa", "Washington");
	Country2.put("Canada", "Ottawa");
	System.out.println("Hashtable capital" + Country2.get("Bangladesh"));
	
	HashSet<String> car = new HashSet <String>();
	 car.add("tasla");
	 car.add("BMW");
	 car.add("toyota");
	 
	 System.out. println("Car :" + car);
	
	
	}		
	

}


