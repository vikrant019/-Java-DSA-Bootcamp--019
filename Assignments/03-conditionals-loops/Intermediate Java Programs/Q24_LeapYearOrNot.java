
import java.util.Scanner;

public class Q24_LeapYearOrNot {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year: ");
		int yr=sc.nextInt();
		if(yr%4==0) {
			System.out.println(yr +" is leap");
		}else {
			System.out.println(yr +" is Not leap");
		}
		
	}

}
