package com.HackerEarth.LinearSearch;

import java.util.Scanner;

public class SquareTranc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] tran = new int[n];
		for(int i=0; i<n; i++)
		{
			tran[i] = in.nextInt();
		}
		int m = in.nextInt();
		int[] tar = new int[m];
		for(int i =0; i<m; i++)
		{
			tar[i] = in.nextInt();
			}
		int sum =0;
		int flag = 1;
		int index = 0;
		for(int i=0; i<m; i++)
		{
			int target = tar[i];
			for(int j=0; j<n ; j++)
			{
				sum += tran[j];
				if( sum >= target)
				{
					flag = 0;
					index = j;
					break;
				}
				
			}
			
			if(flag == 0)
			{
			    flag = 1;
			    sum =0;
			    System.out.println(index+1);
			}
			else
			{
				System.out.println("-1");
				flag = 1;
				sum = 0;
			}
		}
		
		
	}

}
