

import java.util.Scanner;

//HCF of 2 numbers
public class Q20_HCFofTwoNumbers {
    
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input  =  new Scanner(System.in);
        
        System.out.print("Enter 2 numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int hcf=0;
        
        for(int i=1; i<=b; i++) {
        	if(a%i==0 && b%i==0) {
        		hcf=i;
        	}
        }
        System.out.println("HCF : "+ hcf);
    }
}
