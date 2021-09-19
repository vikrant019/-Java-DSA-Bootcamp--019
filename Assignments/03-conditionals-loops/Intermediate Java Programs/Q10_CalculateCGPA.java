//Calculate CGPA Java Program
import java.util.Scanner;

public class Q10_CalculateCGPA {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("how many subject: ");
		float subjectNO=sc.nextInt();
		float total=0;
		System.out.println("Enter marks outof 100: ");
		for(int i=0; i<subjectNO; i++) {
			float subMarks=sc.nextFloat();
			total+=subMarks/9.5;
		}
		System.out.println("CGPA:  "+ ((total/subjectNO)));
	}

}
