//Sum Of A Digits Of Number
import java.util.*;
public class Q25_sumOffADigitsOfNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("How many digits you want to add: ");
		int num=sc.nextInt();
		int sumofDigit=0;
		System.out.println("Enter Numbers: ");
		for(int i=1; i<=num; i++) {
			int digit=sc.nextInt();
			sumofDigit+=digit;
		}
		System.out.println("sum of digits: " + sumofDigit);

	}

}
