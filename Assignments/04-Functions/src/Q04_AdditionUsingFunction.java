//Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;
public class Q04_AdditionUsingFunction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(add(num1,num2));

	}
	static int add(int num1,int num2) {
		return num1+num2;
	}
}
