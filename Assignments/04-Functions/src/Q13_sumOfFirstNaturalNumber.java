//Write a function that returns the sum of first n natural numbers.
import java.util.Scanner;
public class Q13_sumOfFirstNaturalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		System.out.println(fnSum(n));

	}
	static int fnSum(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		return sum;
	}

}
