//Calculate Discount Of Product
import java.util.Scanner;
public class Q4_discountOfProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Product Price: ");
		float product=sc.nextFloat();
		
		System.out.print("Enter discount %: ");
		float discount=sc.nextFloat();
		float result=(discount/100)*product;
		System.out.println(" discount: " + result);
		System.out.println("final value of product (After discount): " + (product-result));
	}

}
