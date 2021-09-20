//Sum Of N Numbers
import java.util.Scanner;
public class Q14_SumOfNnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many Number you want to add : ");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("Enter Numbers : ");
		for(int i=0; i<n;i++) {
			int num1=sc.nextInt();
			sum+=num1;
		}
		
		System.out.println("Addition of Numbers: "+ sum);

	}

}
