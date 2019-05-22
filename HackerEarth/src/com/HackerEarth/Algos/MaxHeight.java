package com.HackerEarth.Algos;

public class MaxHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {3,5,7,9,5,6,5,5};
		
		int largest = 0;
		int ind =0;
		for(int i=0; i<height.length; i=i+2)
		{
			if(height[i] > largest)
			{
				largest = height[i];
				ind = i;
				
			}
		}
		
		int op = (largest*12) + height[ind+1];
		
		System.out.println(op);
		

	}

}
