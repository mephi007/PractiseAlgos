package com.HackerEarth.Algos;

public class SortSpecificOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,5,4,7,10};
		int k=0;
		int n = a.length;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 != 0)
			{
				int temp = a[i];
				a[i] = a[k];
				a[k] = temp;
				k++;
			}
		}
		
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
		
		System.out.println(k);
		
		for(int i=0; i<k-1; i++)
		{
			int max = i;
			for(int j =1; j<k ; j++)
			{
				if(a[j] > a[max])
				{
					max = j;
				}
			}
			
			int temp = a[max];
			a[max] = a[i];
			a[i] = temp;
		}
		
		System.out.println("---------------");
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
		
		for(int i=k; i<n-1; i++)
		{
			int min = i;
			for(int j =i+1; j<n ; j++)
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
		
		System.out.println("---------------");
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
		

	}

}
