package com.HackerEarth.LinearSearch;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int n = a.length;
		
		 int sum=0;
			int max = 0;
		
			for(int i=0;i<n;i++)
			{
				sum += a[i];
			}
		    int  min =sum;
			
			for(int i=0; i<n; i++)
			{
				int diff = sum - a[i];
				if(diff > max)
				    max = diff;
				else if(diff < min)
				 min = diff ;
			}
			
			System.out.println(min+" "+max);
	}

}
