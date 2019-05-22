package com.sumit.mustDoCoding;

import java.util.Scanner;

public class ContinSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of element to be in array");
		int n = in.nextInt();
		System.out.printf("enter elements for array %d times", n);
		int[] a= new int[n];
		for(int i=0; i<n ; i++)
		{
			a[i] = in.nextInt();
		}
		
		System.out.println("enter sum to be found out in subarray");
		int sum = in.nextInt();
		int curr_sum = a[0];
		int start = 0,i;
		int found = 0,p=0;
		
		for(i=1; i<n ;i++)
		{
			while(curr_sum > sum && start < i-1)
			{
				curr_sum -= a[start];
				start++;
			}
			
			if(curr_sum == sum)
			{
				 p = i-1;
				found = 1;
			}
			
			
			curr_sum += a[i];
			
			
		}
		if(found == 1)
			System.out.printf("%d is in between %d and %d", sum, start, p);
		else System.out.println("sum didnt found in array");
		

	}

}
