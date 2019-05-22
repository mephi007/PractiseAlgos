package com.HackerEarth.Algos;

public class MaxSumIncSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,5,4,3};
		int n = a.length;
		int max_soFar =a[0];
		int max_global =0;
		
		for(int i =1; i<n; i++)
		{
			max_soFar += a[i];
			if(max_soFar>max_global)
				max_global = max_soFar;
			
			if(a[i-1] > a[i] || max_soFar <0)
			{
				max_soFar=0;
			}
		}
		
		System.out.println(max_global);

	}

}
