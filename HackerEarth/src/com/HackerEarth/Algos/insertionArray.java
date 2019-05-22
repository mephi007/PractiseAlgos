package com.HackerEarth.Algos;

import java.util.Scanner;

public class insertionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = in.nextInt();
		int[] arr = new int[n+1];
		System.out.println("array elements");
		for(int i=0; i<n; i++)
		{
			arr[i] = in.nextInt();
		}
		System.out.println("enter element to add");
		int item = in.nextInt();
		System.out.println("enter index where you want to add element");
		int k = in.nextInt();
		
		
		for(int i=n-1; i>=k; i--)
			arr[i+1]=arr[i];
		
		arr[k]=item;
		
		for(int i=0; i<n+1; i++)
		{
			System.out.println(arr[i]);
		}
		
		

	}

}
