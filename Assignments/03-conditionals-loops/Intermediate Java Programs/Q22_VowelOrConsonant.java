import java.util.Scanner;
public class Q22_VowelOrConsonant {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
			Scanner sc  =  new Scanner(System.in);
	        
	        System.out.print("Enter a character ");
	        char a=sc.next().charAt(0);
	        
	        if(a=='A' || a=='a') {
	        	System.out.println(" Vowel");
	        }else if(a=='A' ) {
	        	System.out.println(" Vowel");
	        }else if(a=='E') {
	        	System.out.println(" Vowel");
	        }else if(a=='I' ) {
	        	System.out.println(" Vowel");
	        }else if(a=='O' ) {
	        	System.out.println(" Vowel");
	        }else if(a=='U' ) {
	        	System.out.println(" Vowel");
	        }else {
	        	System.out.println("Consonant");
	        }
	        
	}

}
