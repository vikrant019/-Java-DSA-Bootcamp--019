//Reverse A String In Java
import java.util.Scanner;
public class Q17_ReverseAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.next();
		String rs="";
		for(int i=s.length()-1; i>=0; i--) {
			rs=rs+s.charAt(i);
		}
		System.out.println("reverse string is: "+ rs);
	}

}
