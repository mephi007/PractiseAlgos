package com.HackerEarth.Algos;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a = {-7,1,5,2,-4,3,0};
			int n= a.length;
			int leftSum =0,sum =0;
			for(int i =0; i<n ;i++)
			{
				sum = sum + a[i];
			}
			int index=0;
			for(int i=0; i<n; i++)
			{
				sum = sum -a[i];
				
				if(sum == leftSum)
				{
					index = i;
					break;
				}
				leftSum += a[i];
			}
			
			System.out.println(index);
	}

}
