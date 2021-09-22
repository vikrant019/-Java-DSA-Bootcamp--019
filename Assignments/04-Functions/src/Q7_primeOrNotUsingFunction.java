//Define a method to find out if a number is prime or not.

import java.util.Scanner;
public class Q7_primeOrNotUsingFunction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		System.out.println(primeOrNot(num));
	}
  static boolean primeOrNot(int num) {
	  
	  for(int i=2; i<num; i++) {
		  if(num%i==0) {
			 return false;
		  } 
	  }
	  
	  return true;
		
	  }


}