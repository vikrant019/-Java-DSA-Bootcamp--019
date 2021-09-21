import java.util.Scanner;

public class Q21_LCMofTwoNumbers {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
			Scanner input  =  new Scanner(System.in);
	        
	        System.out.print("Enter 2 numbers : ");
	        int a = input.nextInt();
	        int b = input.nextInt();
	        
	        int temp=a*b;
	        
	        int hcf=0;
	        
	        for(int i=1; i<=b; i++) {
	        	if(a%i==0 && b%i==0) {
	        		hcf=i;
	        	}
	        }
	        int lcm= temp/hcf;
	        System.out.println("LCM : "+ lcm);

	}

}
