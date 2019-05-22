package com.HackerEarth.Algos;

import java.util.Scanner;

public class DeletionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("array elements");
		for(int i=0; i<n; i++)
		{
			arr[i] = in.nextInt();
		}
		int k=0;
		System.out.println("enter element to delete");
		int item = in.nextInt();
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] == item)
			{
				k = i;
				break;
			}
			
		}
		
		for(int i =k; i<4; i++)
		{
			arr[k] = arr[k+1];
		}
		
		System.out.println("array after deletion----");
		
		for(int i=0; i<n-1; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
