package MyStr;

public class Count_UpperCase
{
public static void main(String[] args) 
{
	String s="India is my Country";
	char c[]=s.toCharArray();
	int count=0;
	for(int i=0;i<c.length;i++)
	{
		if(c[i]>='A' && c[i]<='Z')
		{
			count=count+1;
		}
	}
	System.out.println("Upper Case Count is "+count);
}
}
