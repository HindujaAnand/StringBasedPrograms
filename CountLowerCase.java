package MyStr;

public class CountLowerCase 
{
	public static void main(String[] args) 
	{
	String s="India is my Country";
	String s1="I love my Country";
	char c[]=new char[s.length()];
	int count=0;
	for(int i=0;i<c.length;i++)
	{
		c[i]=s.charAt(i);
	}
	
	for(int i=0;i<c.length;i++)
	{
		if(c[i]>='A'&&c[i]<='Z')
		{
			count=count+1;
		}
	}
	System.out.println("String s count is " +count);
	System.out.println("String s length is " +s.length());
	System.out.println("String s replace is : " +s.replace('a', '@'));
	System.out.println("String s1 replace all :" +s1.replaceAll("o","@"));
}
}