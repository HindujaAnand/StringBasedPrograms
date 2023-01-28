package MyStr;

public class StringPattern
{
public static void main(String[] args) 
{
	String s="Computer";
	char c[]=new char[s.length()];
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<=i;j++)
		{
			
		c[i]=s.charAt(j);
		System.out.print(c[i]);
	  }
		System.out.println();
}
}
}
