	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
public class Q23_PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		
		int factsum=0;
		for(int i=1; i<num; i++)
		{
			if(num%i==0) {

				factsum+=i;
			}
		}
		
		if(factsum==num) {
			System.out.println(num + " is perfect number");
		}else {
			System.out.println(num + " is Not perfect number");
		}
		
			
	}

}
