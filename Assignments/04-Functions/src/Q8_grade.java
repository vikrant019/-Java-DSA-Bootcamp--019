/*
    Write a program that will ask the user to enter his/her marks (out of 100). 
    Define a method that will display grades according to the marks entered as below:

		Marks        Grade 
		91-100         AA 
		81-90          AB 
		71-80          BB 
		61-70          BC 
		51-60          CD 
		41-50          DD 
		<=40          Fail 

 */

import java.util.Scanner;
public class Q8_grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many subject ? : ");
		int subs=sc.nextInt();
		float totalmarks=0;
		
		for(int i=0; i<subs; i++) {
			float marks=sc.nextFloat();
			totalmarks+=marks;
			
		}
		float percentage=totalmarks/subs;
		System.out.println("Percentage: "+percentage);
		
		grade(percentage);
	}
	
	static void grade(float percentage) {
		if(percentage<=100 && percentage >=90) {
			System.out.println("Grade: AA");
			
		}else if(percentage<=90 && percentage >=80) {
			System.out.println("Grade: AB");
		
	}else if(percentage<=80 && percentage >=70) {
		System.out.println("Grade: BB");

	}else if(percentage<=70 && percentage >=60) {
	System.out.println("Grade: BC");
	}
	else if(percentage<=60 && percentage >=50) {
		System.out.println("Grade: CD");
		}
	else if(percentage<=50 && percentage >=40) {
		System.out.println("Grade: DD");
		}else {
			System.out.println("Your are failed !!");
			
		}
	}

}
