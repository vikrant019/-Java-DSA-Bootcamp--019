//Write a program to print whether a number is even or odd, also take input.
//Take two numbers and print the sum of both.

import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a number: ");
		int num1=sc.nextInt();
		
		if(num1%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
	}

}
