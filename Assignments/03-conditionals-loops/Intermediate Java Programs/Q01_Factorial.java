//Factorial Program In Java
import java.util.Scanner;
public class Q1_Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to print factorial: ");
		int num=sc.nextInt();
		int fact=1;
		int i;
		if(num==0) {
		fact=1;
	}
		for(i=1; i<=num; i++) {
			fact=fact*i;

		}
		System.out.println("Factorial is: "+ fact);
	}

}
