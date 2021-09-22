//Write a function to check if a given triplet is a Pythagorean triplet or not.
//(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
import java.util.Scanner;
public class Q11_PythagoreanTripletorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Thre numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Pythagorean(a,b,c);

	}
	
	static void Pythagorean(int a, int b,int c) {
		int ab=(int) (Math.pow(a, 2)+Math.pow(b, 2));
		int c1=(int) Math.pow(c,2);
		if(ab==c1) {
			System.out.println(a+" "+b+" "+c+"is pythagorean");
		}else {
			System.out.println(a+" "+b+" "+c+" is Not pythagorean");
			
		}
		
	}
}
