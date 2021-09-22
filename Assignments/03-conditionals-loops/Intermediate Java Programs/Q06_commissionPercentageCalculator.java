//Calculate Commission Percentage

import java.util.Scanner;

public class Q6_commissionPercentageCalculator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sale price: ");
		float salePrice=sc.nextFloat();
		System.out.println("Enter comission %: ");
		float cPer=sc.nextFloat();
		System.out.println("comission : "  + (salePrice*cPer)/100);
	}

}
