package com.HackerEarth.LinearSearch;

import java.util.Scanner;

public class GoldenRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 
        int count =0;
        System.out.println("enter size");
            float[] a = new float[2*n];
            for(int j = 0; j<2*n; j++)
            {
                a[j] =s.nextFloat();
            }
            
            for(int k=0; k<a.length; k=k+2)
            {
                double ratio = a[k] /  a[k+1];
                double ratio1 = a[k+1]/a[k];
                if(ratio>=1.600 && ratio<1.71)
                {
                count++;
                }
                if(ratio1>=1.600 && ratio1<1.71)
                {
                	count++;
                }
                System.out.println("count " +count);
                System.out.println(k);
                System.out.println("ratio "+ratio);
            }

        System.out.println(count);
		

	}

}
