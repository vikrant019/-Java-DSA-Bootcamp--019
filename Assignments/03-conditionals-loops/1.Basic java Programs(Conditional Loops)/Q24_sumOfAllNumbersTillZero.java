//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;
public class Q24_sumOfAllNumbersTillZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for add(enter zero to exit loop): ");
		int num=1;
		int add=0;
		
		while(num!=0) {
		 @SuppressWarnings("unused")
		int input=sc.nextInt();
		 num=input;
			add+=num;
		}
		System.out.println(add);
		
	}

}
