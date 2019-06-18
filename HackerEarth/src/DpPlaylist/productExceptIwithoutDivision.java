package DpPlaylist;

public class productExceptIwithoutDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,2,3,5,2};
		int n = a.length;
		int[] b = new int[n];
		 int[] prod1 = new int[n];
		 int[] prod2 = new int[n];
		 //product from begin till i
		 prod1[0] = a[0];
		 for(int i=1; i<n ; i++)
			 prod1[i] = a[i]*prod1[i-1];
		 for(int i: prod1)
			 System.out.println(i);
		 //product from end to i
		 prod2[n-1] = a[n-1];	 
		 for(int i =n-2; i>=0; i--)
			 prod2[i] = a[i]*prod2[i+1];
		 System.out.println("----------------------------");
		 for(int i: prod2)
			 System.out.println(i);
		 //result
		 System.out.println("---------------------------------------");
		 int[] res = new int[n];
		 res[0] = prod2[1];
		 res[n-1] = prod1[n-2];
		 for(int i=1 ; i<n-1; i++)
			 res[i] = prod1[i-1] * prod2[i+1];
		
		 for(int i: res)
			 System.out.println(i);

	}

}
