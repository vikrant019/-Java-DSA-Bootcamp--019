/*
 *Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7]. 
 */

import java.util.Arrays;
import java.util.Scanner;
public class Q05_ShuffleTheArray {

	public static void main(String[] args) {	
		
		Scanner sc=new Scanner(System.in);
		int[] nums=new int[40];
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		int len=2*n;
		int i=0;
		System.out.println("Enter elements: ");
		for( i=0; i<len; i++) {
			nums[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(sufflearray(nums,n,len))); 
		
	}
	static int[] sufflearray(int[] nums, int n,int len) {
		int[] ans=new int[len];
		int i=0;
		int x=0;
		int y=n;
		while(i<len) {
			ans[i++]=nums[x++];
			ans[i++]=nums[y++];
		}

		
		return ans;
	}
}
