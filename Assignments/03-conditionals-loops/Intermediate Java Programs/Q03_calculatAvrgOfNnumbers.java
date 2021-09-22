//Calculate Average Of N Numbers
import java.util.Scanner;
public class Q3_calculatAvrgOfNnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N: ");
		int n=sc.nextInt();
		float sum=0;
		System.out.println("Enter numbers to find there average: ");
		for(int i=1;i<=n;i++) {
			float digit=sc.nextInt();
			sum+=digit;
			
		}
		System.out.println("Average of N number:"+ String.format("%.2f",sum/n ) );
	}

}
