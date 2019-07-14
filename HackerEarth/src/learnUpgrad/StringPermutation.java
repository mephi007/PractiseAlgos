package learnUpgrad;

public class StringPermutation {
	static int count =0;
	public static void permute(String str, int l, int r)
	{

		if(l==r)
		{
			count++;
			System.out.println(str+" "+ count);			
		}
		else
		{
			for(int i=l; i<=r; i++)
			{
				str = swap(str, l,i);
				permute(str, l+1, r);
				str = swap(str, l,i);
			}
		}
	}
	
	public static String swap(String str, int i, int j)
	{
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j]=temp;
		str = String.valueOf(charArray);
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCD";
		int l=0;
		int r = str.length()-1;
		permute(str, l, r);


	}

}
