//Compound Interest Java Program
import java.util.Scanner;
public class Q11_CompoundInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter principle amount: ");
		int p=sc.nextInt();
		System.out.println(" time the money is invested or borrowed for. : ");
		int t=sc.nextInt();
		System.out.println("annual interest rate.: ");
		double r=sc.nextDouble()/100;
		System.out.println("number of times that interest is compounded per unit : ");
		int n=sc.nextInt();
		
		 double amount = p * Math.pow(1 + (r / n), n * t);
	        double cinterest = amount - p;
	        System.out.println("Compound Interest after " + t + " years: "+cinterest);
	        System.out.println("Amount after " + t + " years: "+amount);
				 
				
	}

}
