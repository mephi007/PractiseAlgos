package DpPlaylist;

public class productExceptIwithDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {3,2,1};
		int n = a.length;
		int[] b = new int[n];
		 int product = 1;
		 int totProd =1;
		 for(int i: a)
		 {
		 totProd  *= i;
		 }
		 for(int i=0; i<n ; i++)
		 {
			 b[i] = totProd/a[i];
		 }
		 for(int i: b)
		 {
			 System.out.println(i);
		 }
			 
		 System.out.println(totProd);
	}

}
