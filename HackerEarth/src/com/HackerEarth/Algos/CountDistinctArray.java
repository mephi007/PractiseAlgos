package com.HackerEarth.Algos;

import java.util.Arrays;

public class CountDistinctArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {6, 10, 5, 4, 9, 120, 4, 6, 10};
		Arrays.sort(a);
		int count =1;
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i] != a[i+1])
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
