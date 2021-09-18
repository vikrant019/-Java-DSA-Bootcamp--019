//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Q25_LargestNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for add(enter zero to exit loop): ");
		int num=1;
		
		int max=0;
		while(num!=0) {
		 @SuppressWarnings("unused")
		int input=sc.nextInt();
		 num=input;
		 if (num > max) {
             max = num;
         }
		}
		System.out.println("Greatest number is :" + max);

	}

}
