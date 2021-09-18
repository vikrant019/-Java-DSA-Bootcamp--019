// Take 2 numbers as input and print the largest number.

import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		
		if(num1<num2) {
			System.out.println("Greater Number is " + num2);
		}else {
			System.out.println("Greater Number is " + num1);
		}

	}

}
