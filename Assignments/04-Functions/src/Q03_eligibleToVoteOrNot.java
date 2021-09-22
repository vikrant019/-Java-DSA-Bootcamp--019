/*
 A person is eligible to vote if his/her age is greater 
than or equal to 18. Define a method to find out if he/she is eligible to vote.
*/

import java.util.Scanner;
public class Q03_eligibleToVoteOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		
		System.out.println(eligibleToVote(age));

	}
	static String eligibleToVote(int age)
	{
		if(age<18)
			return "not eligible to vote";
		else
			return "eligible to vote";
	}

}
