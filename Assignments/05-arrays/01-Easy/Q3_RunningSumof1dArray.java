/*
 	Given an array nums. We define a running sum of an array as
 	 runningSum[i] = sum(nums[0]…nums[i]).

	(Return the running sum of nums.)

	Example 1:

	Input: nums = [1,2,3,4]
	Output: [1,3,6,10]
	Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
import java.util.Scanner;
public class Q3_RunningSumof1dArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] nums=new int[4];
		int[] RunningSum=new int[4];
		System.out.println("Enter Array: ");
		for(int i=0; i<nums.length; i++) {
			nums[i]=sc.nextInt();
		}
		for(int i=0; i<nums.length; i++) {
			RunningSum[i]=nums[i];
		}
		for(int i=0; i<nums.length-1; i++) {
			RunningSum[i+1]=RunningSum[i]+RunningSum[i+1];
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(RunningSum[i] + " ");
		}
		
	}

}
