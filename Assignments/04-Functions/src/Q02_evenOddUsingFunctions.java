//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
public class Q02_evenOddUsingFunctions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check even or odd : ");
		int num=sc.nextInt();
		System.out.println(evenOdd(num));
	

	}
static String evenOdd(int a) {
	
	if(a%2==0) {
		return "even";
	}else {
		return "odd";
	}

}
}
