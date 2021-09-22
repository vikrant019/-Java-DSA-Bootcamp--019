//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;
public class Q05_ProductOfTwoNumbersUsignFunction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");

		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(productOf(num1,num2));

	}
	static int productOf(int num1,int num2) {
		return num1*num2;
	}

	}


