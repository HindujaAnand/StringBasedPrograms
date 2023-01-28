package MyStr;

public class Find_Consonants 
{
public static void main(String[] args)
{
	String s="INDIa IS MY CoUNTRY";
	String s1=s.toUpperCase();
	int count=0;
    char c[]=s1.toCharArray();
	
	for(int i=0;i<c.length;i++)
	{
		if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'||c[i]==' ')
		{
		}
		else
		{
			count=count+1;
			System.out.println(c[i]);
		}
	}
	System.out.println("Consonant Count=" +count);
	
	
}
}
