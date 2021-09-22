/*Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

Area or Circle= pi*r*r;
Circumference Of Circle=2*pi*r;
*/
import java.util.Scanner;
public class Q06_AreaAndCircumferenceOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius: ");
		float r=sc.nextFloat();
		
		System.out.println("Area of Circle: " + area(r));
		System.out.println("Area of circumference: " + Circum(r));

	}
	static float area(float r) {
		float pi= (float) 3.14;
		float a=pi*r*r;
		return a;
	}
	static float  Circum(float r) {
		float pi= (float) 3.14;
		
		float c=2*pi*r;
		
		return c;
		
	}

}
