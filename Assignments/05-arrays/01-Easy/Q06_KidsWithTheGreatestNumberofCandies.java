/*
 *  Kids With the Greatest Number of Candies  *
 
 	There are n kids with candies. You are given an integer array candies, 
 	where each candies[i] represents the number of candies the ith kid has,
 	 and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, 
after giving the ith kid all the extraCandies, they will have the greatest 
number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
 */

import java.util.*;
public class Q06_KidsWithTheGreatestNumberofCandies {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter candies size: ");
		int n=sc.nextInt();
		int[] candies= new  int[n];
		
		System.out.println("Enter Extracandies : ");
		int extracandies=sc.nextInt();
		System.out.println("Enter kids candies:");
		for(int i=0;i<n; i++) {
			candies[i]=sc.nextInt();
		}
		System.out.println(KidswithCandies(candies,extracandies));

	}
	static List<Boolean> KidswithCandies(int[] candies, int extracandies){
		
		List<Boolean> ans= new ArrayList<>();
		
		for(int i=0; i<candies.length;i++) {
			boolean flag=false;
			for(int j=0; j<candies.length; j++) {
				if(candies[i]+extracandies<candies[j]) {
					flag=true;
					break;
				}
			}
			if(flag) {
				ans.add(false);
			}else {
				ans.add(true);
			}
		}
		
		
		return ans;
	}
}
