package com.HackerEarth.Algos;

import java.util.Arrays;

public class PossibleSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {6, 10, 5, 4, 9, 120, 4, 6, 10};
		int n = a.length;
		
		for(int i=0; i<(1<<n); i++)
		{
			System.out.print("{ ");
			for(int j =0; j<n; j++)
			{
				if((i & (1<<j)) > 0)
				{
					System.out.print(a[j]+" ");
				}
					
			}
			System.out.print("}");
		}
		

	}

}
