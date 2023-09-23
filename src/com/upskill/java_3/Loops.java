package com.upskill.java_3;

public class Loops {


		/*
		 type of loops
		 1. For loops
		 2.While loops
		 4.Do while loops
		 5Infinite loops
		 */
		
		public static void main(String[] args){ 
			//practiceForLoop();
		  // practiceWhileLoop();
			//practiceDoWhileLoop();
			//practiceInfiniteLoops();
		//	practiceNestedForLoop();
			
		}
		public static void practiceForLoop(){  //for loops - do again and again upto upper limit
			int i;
			for (i = 1; i <=10;i++){
				System.out.println("For Loops Number"+ i);
		}
	}
		
	public static void practiceWhileLoop(){ //While loops - do again and again upto condition match
		int i = 1;
		while(i<=10){
			System.out.println("While Loops Number =" + i);
			i++;
		}
	}
	public static void practiceDoWhileLoop(){ //Do While loops - do action than match the condition 
		int i = 1;
		do {
			System.out.println("Do While Loops Number =" + i );
			i++;
		}while (i<=0);
	}
	public static void practiceInfiniteLoops(){ //infinite loop - never ending loop
			int i;
			for (i = 1; ;i++){
				System.out.println("Infinite Loops Number"+ i);
		}
	}
	public static void practiceNestedForLoop(){
		int i ;
		int j ;
		for (i=1;i<=10;i++){
	    for(j=1; j<=10; j++){
				 int multipicationTable = i * j;
				 System.out.print(multipicationTable + " ");
			 }
			 System.out.println(" ");
		}
		
	}
}

	
	
