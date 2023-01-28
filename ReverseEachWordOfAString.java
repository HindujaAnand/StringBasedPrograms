package thirty;

public class ReverseEachWordOfAString 
{
	public static void main(String[] args) 
	{
	
		String s="I am learning Java";
		String a[]=s.split(" ");
		String reverse="";
		
		for(int i=0;i<a.length;i++)
			{
			String x=a[i];
			String reverseword="";
			
			for( int j=x.length()-1;j>=0;j--)
				
			{
				reverseword= reverseword + x.charAt(j);
			}
			reverse=reverse + reverseword + " ";
			}
		System.out.println(reverse);
	}
}
