//Calculate Batting Average
import java.util.Scanner;
@SuppressWarnings("unused")
public class Q9_CalculateBattingAverage {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter scored Runs: ");
		float scoredRuns=sc.nextInt();
		System.out.println("Enter Battig time out: ");
		float timesOut=sc.nextFloat();
		
		System.out.println("Batting Average: " + (scoredRuns/timesOut));
		

	}

}
