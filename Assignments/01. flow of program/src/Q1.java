//Input a year and find whether it is a leap year or not.

import java.util.*;
public class Q1 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a year: ");
	int year=sc.nextInt();
	if(year%4==0) {
		System.out.println("Yes");
	}else {
		System.out.print("Not");
	}
}
}
