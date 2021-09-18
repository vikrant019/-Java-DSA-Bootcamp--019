//Input a number and print all the factors of that number (use loops).
import java.util.*;
public class Q23_FactorsOfNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to find factors: ");
		int n=sc.nextInt();
		
		
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				System.out.print( i + " ");
			}
		}
		
	}

}
