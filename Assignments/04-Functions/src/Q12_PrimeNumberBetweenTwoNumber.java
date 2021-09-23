
//Write a function that returns all prime numbers between two given numbers.
import java.util.Scanner;
public class Q12_PrimeNumberBetweenTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int fn=sc.nextInt();
		int sn=sc.nextInt();
	    isPrime(fn,sn);

	}

	static void isPrime(int fn,int sn) {
		
		for(int i=fn; i<=sn; i++) {
			int temp=0;
			for(int j=2; j<=i-1;j++) {
				
				
				if(i%j==0) {
				temp+=1;
				
				}
				
				
		}
			if(temp==0) {
				System.out.print(i+" ");
				}
			
			
			
		}
			
	}
}
