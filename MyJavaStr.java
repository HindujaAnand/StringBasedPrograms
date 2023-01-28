package MyStr;

public class MyJavaStr 
{
public static void main(String[] args)
{
	String s="java";
	char c[]=new char[s.length()];
	for(int i=s.length()-1;i>=0;i--)
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
