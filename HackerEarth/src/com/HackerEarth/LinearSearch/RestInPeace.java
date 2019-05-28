package com.sumit.newBeginning;

import java.util.Scanner;

public class RestInPeace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = s.nextInt();
		}
		String[] b = new String[n];
		for(int i=0; i<n; i++)
		{
			b[i] = Integer.toString(a[i]);
		}
		int flag =0;
		for(int i=0; i<n; i++)
		{
			flag = 0;
			if(a[i]%21 == 0)
			{
				flag = 1;
				
			}
			else
			{
				for(int j=1; j<b[i].length()-1; j++)
				{
					if(b[i].charAt(j) == '2')
					{
						if(b[i].charAt(j+1) == '1')
						{
							flag = 1;
							break;
						}
					}
					else if(b[i].charAt(j) == '1')
					{
						if(b[i].charAt(j-1) == '2')
						{
							flag = 1;
							break;
						}
					}
				}
			}
			if(flag == 1)
			{
				
				System.out.println("The streak is broken!");
			}
			else
			{
				System.out.println("The streak lives still in our heart!");
				
			}
			
		}

	}

}
