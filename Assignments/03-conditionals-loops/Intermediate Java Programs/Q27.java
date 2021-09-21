import java.util.Scanner;
public class Q27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Numbers");
	
		int sumOfNeg=0;
		int sumOfeven=0;
		int sumOfodd=0;
		int num=sc.nextInt();
//		int temp=sc.nextInt();
		while(num!=0) {
			
			if(num<0) {
				sumOfNeg=sumOfNeg+num;
			}
			if(num>0) {
				if(num%2==0) {
					sumOfeven=sumOfeven+num;
				}else {
					sumOfodd=sumOfodd+num;
				}
			}
			num=sc.nextInt();
		}
		System.out.println("Sum Of Negative Numbers: " + sumOfNeg);
		System.out.println("Sum Of Positive Even Numbers: " + sumOfeven);
		System.out.println("Sum Of Positive odd Numbers: " + sumOfodd);
	}

}
