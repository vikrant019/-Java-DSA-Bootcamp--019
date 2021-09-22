//Write a function to find if a number is a palindrome or not.
//Take number as parameter.

import java.util.Scanner;
public class Q10_isPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Number to check : ");
		int num=sc.nextInt();
		int cp=isPalindrome(num);
		
		if(cp==num) {
			System.out.println(num + " is Palindrome" );
			
		}else {
			System.out.println(num + " is Not Palindrome" );
		}
	}
	static int isPalindrome(int n) {
		int newN=0;
		while(n>0) {
			int rem=n%10;
			newN=(10*newN)+rem;
			n=n/10;
		}
		return newN;
	}

}
