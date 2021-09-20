import java.util.Scanner;

//Armstrong Number In Java
public class Q15_ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Number you want to cheak Amonsrong or not : ");
		int n=sc.nextInt();
		int temp=n;
		int Amstrong=0;
		for(int i=0; n>0; i++) {
			int a=n%10;
			Amstrong=(int) (Amstrong+ Math.pow(a, 3));
			n=n/10;
			
		}
		if(Amstrong==temp) {
			System.out.println(temp + " is Amstrong");
			
		}else {
			System.out.println(temp + " is Not Amstrong");
		}
	}

}
