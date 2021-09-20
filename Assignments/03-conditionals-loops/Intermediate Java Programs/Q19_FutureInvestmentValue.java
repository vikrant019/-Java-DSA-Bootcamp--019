//Future Investment Value
/*
 Formula:-
 FV=PV(1+I)T
 
 FV = the future value of the investment after t or the number of periods the deposit is invested

PV = the present value of the investment or the beginning value

I = the interest earned on the investment

t = the number of time periods in months the deposit remains invested 
 
 */

import java.util.Scanner;
public class Q19_FutureInvestmentValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Present Value (PV): ");
		double pv=sc.nextDouble();
		
		System.out.print("Enter Interest (I): ");
		double i=sc.nextDouble();
		
		System.out.print("Enter Years (T): ");
		int t=sc.nextInt();
		
		double fv=pv*Math.pow((1+i/100), t);
		
		System.out.println("Future Value: "+ fv);

	}

}
