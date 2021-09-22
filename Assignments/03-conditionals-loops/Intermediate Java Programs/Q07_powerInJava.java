//Power In Java
import java.util.Scanner;
public class Q7_powerInJava {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to show power: ");
		float power=sc.nextFloat();
		System.out.println("Enter Exponential: ");
		float exponential=sc.nextFloat();
		
		System.out.println("power is: " + Math.pow(power,exponential));
	}

}
