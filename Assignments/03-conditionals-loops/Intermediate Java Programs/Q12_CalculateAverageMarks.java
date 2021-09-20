//Calculate Average Marks
import java.util.Scanner;
public class Q12_CalculateAverageMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many subjects ? : ");
		int sub=sc.nextInt();
		float marksSum=0;
		System.out.println("Enter marks : ");
		for(int i=0; i<sub;i++) {
			float marks=sc.nextFloat();
			marksSum+=marks;
		}
		System.out.println("Average marks : " + marksSum/sub);
	}

}
