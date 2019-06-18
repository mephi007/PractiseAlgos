package DpPlaylist;

public class productexceptI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		int n = a.length;
		int[] b = new int[n];
		 int product = 1;
		for(int i=0; i<n; i++)
		{
			 product = 1;
			
			for(int j =0; j<n ; j++)
			{
				if( j!= i)
				{
					product = product * a[j];
				}
			}
			
			b[i] = product;
		}
			
		
		for(int i=0; i<n; i++)
		{
			System.out.println(b[i]);
		}
	}

}
