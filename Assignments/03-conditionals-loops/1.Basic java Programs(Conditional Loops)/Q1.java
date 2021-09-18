//Area Of Circle Java Program
import java.util.*;
public class Q1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float pi=(float) 3.14;
		System.out.print("Enter radius: ");
		float r=sc.nextFloat();
		float result=pi*r*r;
		System.out.println("Radius of circle is: "+ result);
		
		
	}

}
