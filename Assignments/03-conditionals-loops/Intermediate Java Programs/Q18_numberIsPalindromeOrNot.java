//Find if a number is palindrome or not
import java.util.Scanner;
public class Q18_numberIsPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number ot check Palindrome or Not: ");
		int n=sc.nextInt();
		int temp=n;
		int newn=0;
		while(n>0) {
			int reverse=n%10;
			newn=(10*newn)+reverse;
			n=n/10;
		}
		if(newn==temp) {
			System.out.println(temp + " is palindrome");
		}
		
	}
	

}
