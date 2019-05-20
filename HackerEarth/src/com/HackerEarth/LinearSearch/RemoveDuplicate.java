package com.HackerEarth.LinearSearch;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {1,2,3,4,2};
		Arrays.sort(b);
		int n= b.length;
		int[] temp = new int[n];
		int j = 0;
		for(int i=0; i<n-1; i++)
		{
			if(b[i] != b[i+1])
				temp[j++] = b[i];
		}
		temp[j++] = b[n-1];
		
		for(int i=0; i<j; i++)
		{
			b[i] = temp[i];
		}
		
		for(int i =0; i<j; i++)
			System.out.println(b[i]);

	}

}
