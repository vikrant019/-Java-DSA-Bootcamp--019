//Fibonacci series in java
import java.util.*;
public class Q21_fibonicciSeries {
		@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int fno=0;
		int sno=1;
		System.out.println("enter fibonacci term: ");
		int n=sc.nextInt();
		int count=2;
		while(count<=n) {
			
			int temp=sno;
			sno+=fno;
			fno=temp;
			count++;
		}
		System.out.print(sno);
		}

}
