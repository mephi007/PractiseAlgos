package learnUpgrad;

public class GoldBachsConjecture {
	public static void sieveOfEratosthenes(int n, Boolean[] prime)
	{
		for(int i=0; i<=n ; i++)
		{
			prime[i] = true;
		}
		
		for(int p=2; p*p <=n; p++)
		{
			if(prime[p]==true)
			{
				for(int i = p*p; i <=n; i++)
				{
					prime[p] = false;
				}
			}
		}
		int diff = 0;
		for(int i=2; i<=n; i++)
		{
			if(prime[i] == true)
				diff = n - i;
				if(primtility_check(diff))
				{
					System.out.println(i+" "+diff);
					break;
				}
		}
	}
	
	public static Boolean primtility_check(int n)
	{
		if(n<=1) return false;
		if(n <=3) return true;
		if(n%2 == 0 || n%3 == 0) return false;
		for(int i=5; i<= Math.sqrt(n); i = i+6)
		{
			if((n%i == 0) || (n%(i+2) == 0))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 44;
		Boolean prime[] = new Boolean[num+1];
		sieveOfEratosthenes(num, prime);
	}

}
