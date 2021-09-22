//Define two methods to print the maximum and the minimum number respectively among three
//numbers entered by the user.
import java.util.Scanner;

public class Q01_MinimumAndMaximumThreeNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How three numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println(MinMax(num1,num2,num3));
	}
		static int MinMax(int num1,int num2,int num3) {
			int maxtemp=num1;
			int mintemp=num1;
			
			if(num2>maxtemp) {
				maxtemp=num2;
			}else {
				mintemp=num2;
			}
			 if(num3>maxtemp) {
				maxtemp=num3;
			}
			else {
				mintemp=num3;
			}
			System.out.println("maximum : " + maxtemp);
			System.out.println("minimum : " + mintemp);
			return 0;
		}
}
