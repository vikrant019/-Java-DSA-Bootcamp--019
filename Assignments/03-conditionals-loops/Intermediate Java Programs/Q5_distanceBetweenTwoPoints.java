//Calculate Distance Between Two Points
import java.util.Scanner;
import java.math.*;
public class Q5_distanceBetweenTwoPoints {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of x1 & y1 :");
	int x1=sc.nextInt();
	int y1=sc.nextInt();;
	
	System.out.println("Enter value of x2 & y2 :");
	int x2=sc.nextInt();
	int y2=sc.nextInt();;
	int ans=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
	System.out.println("distance between two lines: "+ Math.sqrt(ans));
	}
}
