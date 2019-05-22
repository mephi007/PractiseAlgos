package com.sumit.mustDoCoding;

import java.util.Arrays;

public class SortZerosOneTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,2,1,2,0};
		int n = a.length;

//		Arrays.sort(a);
		for(int i=0; i<n-1; i++)
		{
			int min =i;
			for(int j=i+1; j<n; j++)
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		
		System.out.println("array");
		for(int k=0; k<n; k++)
		{
			System.out.println(a[k]);
		}

	}

}
