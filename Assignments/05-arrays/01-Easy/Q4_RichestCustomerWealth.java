/*
  You are given an m x n integer grid accounts where accounts[i][j] 
  is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. 
  Return the wealth that the richest customer has.

  A customer's wealth is the amount of money they have in all their bank accounts.
   The richest customer is the customer that has the maximum wealth.
 */

import java.util.Scanner;
public class Q4_RichestCustomerWealth {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
			
			int[][] accounts= {
					{1,3,5},
					{4,6,8},
					{8,6,3}};
			
			System.out.println("wealth of Ritchest persont: " + maximumWealth(accounts));
			
		}

	    static int maximumWealth(int[][] accounts) {
	        int max=0;
	       
	        for(int i=0; i<accounts.length; i++){
	              int sum=0;
	            for(int j=0; j<accounts[i].length; j++){
	               
	                sum+=accounts[i][j];
	                  
	            }
	            max=Math.max(max,sum);
	        }
	        return max;
	    }
	}



