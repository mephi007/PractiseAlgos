package com.sumit.newBeginning;

public class FindTheFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date = 12;
		int[] car = {2375,7682,2325,2352};
		int[] pen = {250,500,350,200};
		int fine =0;
		if(date%2 == 0)
		{
			for(int i=0; i<car.length; i++)
			{
				if(car[i]%2 != 0)
				{
					fine += pen[i];
				}
			}
		}
		else
		{
			for(int i=0; i<car.length; i++)
			{
				if(car[i]%2 == 0)
				{
					fine += pen[i];
				}
			}
		}
		
		System.out.println(fine);
	}

}
