package MyStr;

public class Anagram 
{
static String sort(	char z[])
{
for (int i=0;i<z.length;i++)
	{
		for(int j=i+1;j<z.length;j++)
		{
			if(z[i]>z[j])
			{
				char temp=z[i];
				z[i]=z[j];
				z[j]=temp;
			}
		}
	}
	String s=String.valueOf(z);
	System.out.println(s);
	return s;
}
 public static void main(String[] args)
{
	 
	String a="bear";
	String b="bare";
	
	char x[]=a.toCharArray();
	char y[]=b.toCharArray();
	 
	String c=sort(x);
	String d=sort(y);
	
	if(c.equals(d))
	{
		System.out.println("Anogram");
	}
	else
	{
		System.out.println("Not an Anogram");
	}
	}
}