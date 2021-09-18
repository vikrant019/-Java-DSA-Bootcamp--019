//Write a program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.


import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of P: ");
		int p=sc.nextInt();
		System.out.println("Enter value of T: ");
		int t=sc.nextInt();
		System.out.println("Enter value of R: ");
		int r=sc.nextInt();
		int result=(p*t*r)/100;
		System.out.println(result);

	}

}
