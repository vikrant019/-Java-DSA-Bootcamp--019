//Take name as input and print a greeting message for that name.

import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name: ");
		
		String username=sc.nextLine();
		System.out.println("hello !! " + username + " greeting msg from command line");
	}

}
