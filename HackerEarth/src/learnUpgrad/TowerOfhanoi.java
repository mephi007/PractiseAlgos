package learnUpgrad;

public class TowerOfhanoi {
	
	public static void Toh(int n, char beg, char aux, char end)
	{
		if(n==1)
		{
			System.out.println( beg + " to rod " + end); 
            return; 
		}
		
		else
		{
			Toh(n-1, beg,end,aux);
			System.out.println( beg + " to rod " + end);
			Toh(n-1,aux,beg,end);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char beg = 'a', end = 'c' , aux = 'b';
		int n = 3;
		
		Toh(n, beg, aux,end);

	}

}
