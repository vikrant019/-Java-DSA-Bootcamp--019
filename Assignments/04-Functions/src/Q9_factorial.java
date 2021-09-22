/*
 *
    Write a program to print the factorial of a number by defining a method
     named 'Factorial'. Factorial of any number n is represented by n! and 
     is equal to 1 * 2 * 3 * .... * (n-1) *n.
     
      E.g.-
	4! = 1 * 2 * 3 * 4 = 24 
	3! = 3 * 2 * 1 = 6 
	2! = 2 * 1 = 2 
	Also, 
	1! = 1 
	0! = 1
 
 */
import java.util.Scanner;
public class Q9_factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		for(int i=num; i>=0; i--) {
			System.out.println(i+ "! = "  + Factorial(i));
			
		}
		
	}
	static int Factorial(int n) {
		int fact=1;
		int i;
		for(i=1; i<=n; i++) {
			fact=fact*i;
		}
		return fact;	
	}
}
