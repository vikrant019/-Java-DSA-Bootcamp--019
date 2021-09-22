import java.util.Scanner;

public class Q8_DepreciationValue {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		long amount,deppercent,year,afterdep,temp;
		System.out.println("Enter amount: ");
		 amount=sc.nextLong();
			System.out.println("Enter deppercent: ");
		 deppercent=sc.nextLong();
			System.out.println("Enter year: ");
		 year=sc.nextLong();
		 temp=amount;
		 for(int i=0;i<year;i++)
		 temp=((100-deppercent)*temp)/100;
		 System.out.println("after depreciation = "+temp);

	}

}
