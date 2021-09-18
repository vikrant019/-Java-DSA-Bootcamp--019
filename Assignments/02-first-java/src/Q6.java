import java.util.Scanner;

//Input currency in rupees and output in USD.
public class Q6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter currency(INR): ");
		
		float num1=sc.nextFloat();
		float usd=(float) (num1*0.014); 
		
		System.out.println(num1 + " INR = "+ usd + " USD");
	}

}
