/*
 	Given two arrays of integers nums and index. Your task is to create target 
 	array under the following rules:

    Initially target array is empty.
    From left to right read nums[i] and index[i], insert at index index[i] the 
    value nums[i] in target array.
    Repeat the previous step until there are no elements to read in nums and
     index.

Return the target array.

It is guaranteed that the insertion operations will be valid.

 

Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
 */

import java.util.*;
public class Q09_CreateTargetArrayInTheGivenOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index and array size: ");
		int n=sc.nextInt();
		int[] nums=new int[n];
		int[] index=new int[n];
		System.out.println("Enter nums: ");
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
			
		}
		System.out.println("Enter index: ");
		for(int i=0; i<n; i++) {
			 index[i]=sc.nextInt();
			
		}
		System.out.println("Output: " + Arrays.toString(createTargetArray( nums, index)));

	}
	static int[] createTargetArray(int[] nums, int[] index) {
		
		ArrayList<Integer> a=new ArrayList<>();
		int[] ans=new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			a.add(index[i],nums[i]);
		}
		
		for(int i=0; i<nums.length; i++) {
			ans[i]=a.get(i);
		}
		return ans;
	}

}
