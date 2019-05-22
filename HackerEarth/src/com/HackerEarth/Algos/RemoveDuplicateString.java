package com.HackerEarth.Algos;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeek";
		int n = str.length();
		String[] s = str.split("");
		for(String i:s)
			System.out.print(i);
		
		for(int i=0; i<n-1; i++)
		{
			int count=0;
			for(int j=i+1; j< n; j++)
			{
				if(s[i].equals(s[j]))
				{
					count++;
					s[j] = s[j+1];
				}
			}
			n = n-count;
		}
		
		System.out.println("-----------------");
		for(String i:s)
			System.out.print(i);

	}

}
