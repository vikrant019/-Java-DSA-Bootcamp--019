/*
 Given the array nums, for each nums[i] find out how many numbers in the array 
 are smaller than it. That is, for each nums[i] you have to count the number of 
 valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
 */

import java.util.*;
public class Q8_HowManyNumbersAreSmallerThanTheCurrentNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int[] nums=new int[n];	
	
	System.out.println("Enter elements: ");
	for(int i=0; i<n; i++) {
		nums[i]=sc.nextInt();
	}
	
	System.out.print(Arrays.toString(smallerNumbersThanCurrent(nums)));
	
	
	}
	static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] ans=new int[nums.length];
        for(int i=0; i<nums.length; i++){
        int count=0;
            for(int j=0; j<nums.length; j++){
                
                if(nums[i]> nums[j] && i!=j){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
	}
}
	