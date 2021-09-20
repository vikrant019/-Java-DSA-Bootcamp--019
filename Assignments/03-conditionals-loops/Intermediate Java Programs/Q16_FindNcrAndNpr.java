//Find Ncr & Npr
import java.util.Scanner;
@SuppressWarnings("unused")
public class Q16_FindNcrAndNpr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  n : ");
		int n=sc.nextInt();
		System.out.println("Enter r : ");
		int r=sc.nextInt();
		int n_r=n-r;
		int factOfn_r=1;
		int i=0;
		int j=0;
		int k=0;
		int factOfn=1;
		int factOfr=1;
	
		if(n<=0) {
			n=1;
			
			
		}
		if(r<=0) {
			r=1;
			
			
		}
		if(n_r<=0) {
			n_r=1;
			
			
		}


			for(i=1; i<=n; i++) {
				factOfn=factOfn*i;

			}
			for(j=1; j<=r; j++) {
				factOfr=factOfr*j;

			}
			for(k=1; k<=n_r; k++) {
				factOfn_r=factOfn_r*k;

			}
			double nCr=factOfn/factOfr*factOfn_r;
			float nPr=factOfn/factOfn_r;
			System.out.println("value of nCr: "+ nCr);
			System.out.println("value of nPr: "+ nPr);
	}

}
