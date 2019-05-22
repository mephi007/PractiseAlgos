package com.HackerEarth.LinearSearch;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int n = a.length;
		
		int sum=0;
		int max = 0;
		int min =0;
		for(int i:a)
		{
			min += i;
		}
		
		for(int i=0; i<n; i++)
		{
			sum =0;
			for(int j=0; j<n; j++)
			{
				if(j!=i)
					sum +=a[j];
			}
			if(sum > max)
				max = sum;
			else if(sum < min)
				min = sum;
		}
		
		System.out.println(max);
		System.out.println(min);
	}

}
