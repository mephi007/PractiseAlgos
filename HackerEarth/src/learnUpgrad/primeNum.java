package learnUpgrad;

import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for(int i=2; i<=num; i++)
		{
			for(int j=2; j<=i; j++)
			{
				if(i%j == 0)
				{
					if(j == i)
					{
						System.out.println(i);
					}
					else
					{
						break;
					}
				}
			}
		}

	}

}
