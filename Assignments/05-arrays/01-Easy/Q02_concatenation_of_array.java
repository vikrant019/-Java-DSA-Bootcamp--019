import java.util.Scanner;

public class Q02_concatenation_of_array {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int input=sc.nextInt();
		int[] nums=new int[input];
        int n=nums.length; 
        int[] ans=new int[n*2];
        System.out.println("Enter Array elements: ");
        for(int i=0; i<input; i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0; i<input; i++){
            ans[i]=nums[i];
        }
         for(int i=0; i<n; i++){
            ans[i+n]=nums[i];
        }
         
         for(int i=0; i<ans.length; i++){
            System.out.print( ans[i]+" ");
         }

	}

}
