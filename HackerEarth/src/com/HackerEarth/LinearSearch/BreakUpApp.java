package com.HackerEarth.LinearSearch;

import java.util.Scanner;

public class BreakUpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int teenCount = 0;
		int twCount=0;
		int teenSum =0;
		int twSum =0;
		for(int k=0; k<t; k++)
		{
			String str = in.next();
			teenCount=0;
			twCount=0;
			System.out.println(str.indexOf("I"));
			
			String[] msgSplit = str.split(" ");
			
			for(int i=0; i<msgSplit.length; i++)
			{
				
//				if(msgSplit[i].equals("19"))
//				{
//					teenCount++;
//					if(msgSplit[0].contains("G:"))
//						teenSum += 2*teenCount;
//						
//				}
//				if(msgSplit[i].equals("20"))
//				{
//					twCount++;
//				}
				
			}
			
			
		}
		
		System.out.println(teenCount);
		System.out.println(twCount);
	}

}
