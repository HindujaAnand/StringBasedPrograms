package MyStr;

public class Count_a 
{
public static void main(String[] args) {
	String s="India is my Country";
	char c[]=new char[s.length()];
	
	for(int i=0;i<c.length;i++)
	{
		c[i]=s.charAt(i);
	}
	
	int count=0;
	char search='a';
	
	for(int i=0;i<c.length;i++)
	{
		if(c[i]==search)
		{
			count=count+1;
		}
	}
	System.out.println(count);
}
}
