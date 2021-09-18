//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		
		System.out.print("Enter operator(+,-,*): ");
		char operator=sc.next().charAt(0);
		
		if(operator=='+') {
			System.out.println(num1+num2);
		}else if(operator=='-') {
			System.out.println(num1-num2);
		}else if(operator=='*') {
			System.out.println(num1*num2);
		}else {
			System.out.println("Enter valid opertor");
		}
	}

}
