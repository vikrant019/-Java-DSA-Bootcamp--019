//Subtract the Product and Sum of Digits of an Integer
import java.util.*;
public class Q22 {
	public static void main(String art[]) {
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);

System.out.println("enter n: ");
int n=sc.nextInt();

int add=0;	
int mul=1;

while(n>0) {
	int aresult=n%10;
	add=add+aresult;
	mul=mul*aresult;
	n=n/=10;

}
	int finalresult=mul-add;
	System.out.println(finalresult);
	

	}
}
